package com.fruit_shop.kata.fruits

trait Fruit {
  def pricesInEuro : Double
  def pricesInCents: Int =  (pricesInEuro * 100).toInt
}
