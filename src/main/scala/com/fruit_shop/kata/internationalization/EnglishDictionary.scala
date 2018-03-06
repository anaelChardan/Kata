package com.fruit_shop.kata.internationalization

import com.fruit_shop.kata.fruits.{Apple, Banana, Cherry, Fruit}

class EnglishDictionary extends LanguageDictionary[English] {
  override def getLangue: Language = new English
  override def translations: Map[String, Fruit] = Map(
    "Apples" -> Apple(),
    "Bananas" -> Banana(),
    "Cherries" -> Cherry()
  )
}
