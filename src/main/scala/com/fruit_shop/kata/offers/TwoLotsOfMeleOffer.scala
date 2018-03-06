package com.fruit_shop.kata.offers

import com.fruit_shop.kata.cashier_machine.Basket
import com.fruit_shop.kata.fruits.Apple
import com.fruit_shop.kata.internationalization.Italian

class TwoLotsOfMeleOffer extends Offer {
  override def offer(basket: Basket): Int = {
    val italianApples = basket.getFruitPerLanguageAndType(new Italian(), new Apple())

    if (italianApples.size < 2) {
      return 0
    }

    italianApples.size / 2 - ((2 * Apple.pricesInCents) - 1)
  }
}
