package com.scala.hello

object MainCustomThread extends App {

    val thread = new CustomThreadClass()

    // Start the thread
    thread.start()

    // Block the current thread until it's finished
    thread.join()
    
    print("End ")
}
