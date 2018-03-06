package languages

import fruits.{Apple, Fruit}

class ItalianDictionary extends LanguageDictionary {
  override def translations: Map[String, Fruit] = Map(
    "Mele" ->  Apple("italian")
  )
}
