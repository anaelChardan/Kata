package com.fruit_shop.kata.internationalization

import com.fruit_shop.kata.fruits.{Apple, Banana, Cherry, Fruit}

class FrenchDictionary extends LanguageDictionary[French] {
  override def getLangue: Language = new French
  override def translations: Map[String, Fruit] = Map(
    "Pommes" -> Apple(),
    "Bananes" -> Banana(),
    "Cerises" -> Cherry()
  )


}
