package languages

import fruits.{Apple, Banana, Cherry, Fruit}

class FrenchDictionary extends LanguageDictionary {
  override def translations: Map[String, Fruit] = Map(
    "Pommes" -> Apple("french"),
    "Bananes" -> Banana("french"),
    "Cerises" -> Cherry("french")
  )
}
