package com.fruit_shop.kata.cashier_machine

import com.fruit_shop.kata.internationalization._
import com.fruit_shop.kata.offers._

class CashierMachine(val basket: Basket = new Basket(Map.empty)) {

  val offers: List[Offer] = List(new TwoPackCherries, new TwoPackBananas, new GlobalOffer, new ApplesOffer, new ThreeLotsOfAppleOffer, new TwoLotsOfMeleOffer)
  val languageDictionaries = List(new FrenchDictionary, new EnglishDictionary, new ItalianDictionary)

  def enter(fruit: String): CashierMachine = {

    languageDictionaries
      .find(_.containsKey(fruit))
      .map(languageDictionary => new CashierMachine(basket.add(languageDictionary.getLangue, languageDictionary.translations(fruit))))
      .getOrElse(this)
  }

  val total: Int = {
    val sum = basket.getFruits.map(e => e.pricesInCents).sum
    val offer = offers.map(offer => offer.offer(basket)).sum

    println(s"> Without reduction $sum")
    println(s"> Offer $offer")

    sum - offer
  }
}
