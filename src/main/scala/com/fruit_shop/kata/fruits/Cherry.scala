package com.fruit_shop.kata.fruits

case class Cherry() extends Fruit {
  override def pricesInEuro: Double = Cherry.pricesInEuro
}

object Cherry {
  def pricesInEuro: Double = 0.75
  def pricesInCents: Int =  (pricesInEuro * 100).toInt
}
