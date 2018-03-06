package com.fruit_shop.kata.internationalization

import com.fruit_shop.kata.fruits.Fruit

trait LanguageDictionary[L <: Language] {
  def translations: Map[String, Fruit]
  def getLangue: Language
  def containsKey(key: String): Boolean = translations.get(key).isDefined
}