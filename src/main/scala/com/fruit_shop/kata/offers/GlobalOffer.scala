package com.fruit_shop.kata.offers

import com.fruit_shop.kata.cashier_machine.Basket

class GlobalOffer extends Offer {
  def offer(basket: Basket) : Int =  basket.getFruits.size / 5 * 200
}
