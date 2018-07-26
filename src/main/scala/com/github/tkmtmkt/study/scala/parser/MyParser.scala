package com.github.tkmtmkt.scala.parser

import scala.util.parsing.combinator._

object MyParser extends RegexParsers {
  def postalCode = """\d{3}""".r ~ "-" ~ """\d{4}""".r
}
