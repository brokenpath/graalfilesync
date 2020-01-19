package yxz.nowhere

import better.files._
import File._

object Main extends App {
   val f1: File = File("/home/maov/github/graalvm-test/build.sbt")
   print(f1.md5)
}