package com.fruit_shop.kata.offers
import com.fruit_shop.kata.cashier_machine.Basket
import com.fruit_shop.kata.fruits.Apple
import com.fruit_shop.kata.internationalization.English

class ThreeLotsOfAppleOffer extends Offer {
  override def offer(basket: Basket): Int = {
    val englishApples = basket.getFruitPerLanguageAndType(new English(), new Apple())

    if (englishApples.size < 3) {
      return 0
    }

    englishApples.size / 3 - ((3 * Apple.pricesInCents) - 2)
  }
}
