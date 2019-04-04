package com.scala.hello.syncronized

import com.scala.hello.syncronized.Atom

object HelloWorld {

  def main(args: Array[String]): Unit = {
    val monitor = ""

    // Pass the same monitor to the threads
    val thread1 = new Atom("Atom 1", monitor)
    val thread2 = new Atom("Atom 2", monitor)

    thread1.setName("thread1");
    
    println("thread name: "+thread1.getName());
    // Start the threads. Their executions will not overlap.
    thread1.start()
    thread2.start()

    // Block the current thread until they're finished
    thread1.join()
    thread2.join()

  }
}

//set name