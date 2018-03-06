package com.fruit_shop.kata.offers

import com.fruit_shop.kata.cashier_machine.Basket

trait Offer{
  def offer(basket: Basket) : Int
}
