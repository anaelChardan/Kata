package com.fruit_shop.kata.offers

import com.fruit_shop.kata.cashier_machine.Basket
import com.fruit_shop.kata.fruits.Banana

class TwoPackBananas extends Offer {
  override def offer(basket: Basket): Int = basket.getFruitPerType[Banana].size / 2 * Banana.pricesInCents
}
