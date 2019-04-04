package com.scala.hello

class CustomThreadClass extends Thread {

  // Override the run method - its code will
  // be run in a separate thread
  override def run = println("From CustomThreadClass")
}