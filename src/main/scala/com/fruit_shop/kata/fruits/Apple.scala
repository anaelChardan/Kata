package com.fruit_shop.kata.fruits

case class Apple() extends Fruit {
  override def pricesInEuro: Double = Apple.pricesInEuro
}

object Apple {
  def pricesInEuro: Double = 1
  def pricesInCents: Int =  (pricesInEuro * 100).toInt
}