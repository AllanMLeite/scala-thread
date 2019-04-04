package com.scala.hello.syncronized

// Thread class - takes the monitor as a constructor arg
class Atom(name : String, monitor: AnyRef) extends Thread {
  override def run = {
    // Synch by the monitor given in the constructor
    monitor.synchronized {
      // This code can not run smultaneously for a given monitor
      println(s"Atomic Operation Part 1 in $name")
      println(s"Atomic Operation Part 2 in $name")
      println(s"Atomic Operation Part 3 in $name")
    }
  }
}