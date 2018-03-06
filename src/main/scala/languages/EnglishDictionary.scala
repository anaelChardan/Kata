package languages

import fruits.{Apple, Banana, Cherry, Fruit}

class EnglishDictionary extends LanguageDictionary {
  override def translations: Map[String, Fruit] = Map(
    "Apples" -> Apple("english"),
    "Bananas" -> Banana("english"),
    "Cherries" -> Cherry("english")
  )
}
