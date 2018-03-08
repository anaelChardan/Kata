package com.fruit_shop.kata.offers

import com.fruit_shop.kata.cashier_machine.Basket
import com.fruit_shop.kata.fruits.Apple

class ApplesOffer extends Offer {
  override def offer(basket: Basket): Int = basket.getFruitPerType[Apple].size / 2 * 100
}
