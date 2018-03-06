package com.fruit_shop.kata.cashier_machine

import com.fruit_shop.kata.fruits.{Apple, Banana, Cherry, Fruit}
import com.fruit_shop.kata.internationalization.Language

class Basket(basket: Map[Language, List[Fruit]]) {
  def add(language: Language, fruit: Fruit): Basket = {
      new Basket(basket + (language -> (fruit :: getFruitPerLanguage(language))))
  }

  def getFruitPerLanguage(language: Language): List[Fruit] = {
    basket.getOrElse(language, List.empty)
  }

  def getFruitPerLanguageAndType(language: Language, fruit: Fruit): List[Fruit] = {
    getFruitPerType(fruit, getFruitPerLanguage(language))
  }

  def getFruitPerType(fruit: Fruit, fruitList: List[Fruit] = basket.flatMap(_._2).toList): List[Fruit] = {
    fruit match {
      case Apple() => fruitList.collect { case p:Apple => p }
      case Cherry() => fruitList.collect { case c:Cherry => c}
      case Banana() => fruitList.collect { case b:Banana => b}
    }
  }

  def getFruits: List[Fruit] = basket.flatMap(_._2).toList

}
