package com.fruit_shop.kata.fruits

case class Banana() extends Fruit {
  override def pricesInEuro: Double = Banana.pricesInEuro
}

object Banana {
  val pricesInEuro: Double = 1.5
  def pricesInCents: Int =  (pricesInEuro * 100).toInt
}
