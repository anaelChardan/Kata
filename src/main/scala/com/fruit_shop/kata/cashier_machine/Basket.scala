package com.fruit_shop.kata.cashier_machine

import com.fruit_shop.kata.fruits.Fruit
import com.fruit_shop.kata.internationalization.Language

abstract class Entry[+F](language: Language, entry: F)(implicit ma: Manifest[F]){
  val entryType: Class[_] = ma.runtimeClass
  def isEqual(classType: Class[_], language: Language): Boolean = classType == entryType && language == this.language
}

case class BasketEntry(language: Language, fruit: Fruit) extends Entry[Fruit](language, fruit) {}

case class Basket(basket: List[BasketEntry]) {
  def add[F <: Fruit](language: Language, fruit: F)(implicit ma: Manifest[F]): Basket = Basket(BasketEntry(language, fruit) :: basket)

  def getFruits: List[Fruit] = basket.map(_.fruit)

  def getFruitPerLanguage(language: Language): List[Fruit] = basket.filter(_.language == language).map(_.fruit)
  def getFruitPerType[F <: Fruit](implicit ma: Manifest[F]): List[Fruit] = basket.filter(_.entryType == ma.runtimeClass).map(_.fruit)

  def getFruitPerLanguageAndType[F <: Fruit](language: Language)(implicit ma:Manifest[F]): List[Fruit] = {
    basket.filter(_.isEqual(ma.runtimeClass, language)).map(_.fruit)
  }
}
