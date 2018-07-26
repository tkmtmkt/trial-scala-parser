package com.github.tkmtmkt.scala.parser

object Hello extends Greeting with App {
  println(greeting)
  println(PostalCodeParser.parseAll(PostalCodeParser.postalCode, "123-4567").get)
}

trait Greeting {
  lazy val greeting: String = "hello"
}
