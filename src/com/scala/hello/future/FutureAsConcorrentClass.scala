package com.scala.hello.future

import scala.concurrent.{ Future => ConcurrentTask } // rename
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{ Failure, Success }

object FutureAsConcurrentTask extends App {

  println(s"Got the callback, valu")

  val task = ConcurrentTask {
            throw new RuntimeException("error x")
//    "success"
  }

  // whenever the task completes, execute this code
  task.onComplete {
    case Success(value) => println(s"Got the callback, value = $value")
    case Failure(e)     => println(s"D'oh! The task failed: ${e.getMessage}")
  }
}