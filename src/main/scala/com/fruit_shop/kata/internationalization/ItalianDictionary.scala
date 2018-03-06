package com.fruit_shop.kata.internationalization

import com.fruit_shop.kata.fruits.{Apple, Fruit}

class ItalianDictionary extends LanguageDictionary[Italian] {
  override def getLangue: Language = new Italian
  override def translations: Map[String, Fruit] = Map(
    "Mele" ->  Apple()
  )
}
