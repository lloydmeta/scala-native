package demo

import scalanative.native._, stdlib._
import scala.annotation.tailrec

case class Greeting(name: String)

object Main {

    def fib(n: Long):Long = {
      @tailrec
      def fib(until: Long, current: Long, acc1: Long, acc2: Long): Long = {
        if (until <= 0) {
          acc1
        } else if (until == 1) {
          acc1
        } else if (current == until) {
          acc1
        } else {
          fib(until, current + 1, acc1 + acc2, acc1)
        }
      }
      fib(n, 0, 0, 1)
    }

    def main(args: Array[String]): Unit = {
      val fibUntil = 1000
      fprintf(__stderrp, c"%d", fib(fibUntil))
    }
}
