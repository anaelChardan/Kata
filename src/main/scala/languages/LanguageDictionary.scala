package languages

import fruits.Fruit

trait LanguageDictionary {
  def translations: Map[String, Fruit]
}