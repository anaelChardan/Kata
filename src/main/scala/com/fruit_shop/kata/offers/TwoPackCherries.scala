package com.fruit_shop.kata.offers

import com.fruit_shop.kata.cashier_machine.Basket
import com.fruit_shop.kata.fruits.Cherry

class TwoPackCherries extends Offer {
  def offer(basket: Basket) : Int = basket.getFruitPerType[Cherry].size / 2 * 20
}
