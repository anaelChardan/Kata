import fruits.Fruit
import languages.{EnglishDictionary, FrenchDictionary, ItalianDictionary, LanguageDictionary}
import offers.{BananaOffer, CherryOffer, GlobalOffer, Offer}

class CashierMachine(val fruits: List[Fruit] = List.empty) {

  val offers: List[Offer] = List(new CherryOffer, new BananaOffer, new GlobalOffer)
  val languages: List[LanguageDictionary] = List(new FrenchDictionary, new EnglishDictionary, new ItalianDictionary)

  def enter(fruit: String): CashierMachine = {
    val allLanguages = languages.flatMap(e => e.translations).toMap

    allLanguages.get(fruit).map(elem => new CashierMachine(elem :: fruits)).getOrElse(this)
  }

  val total: Int = {
    val sum = fruits.map(e => e.pricesInEuro * 100).foldLeft(0) { (a, num) => a + num.toInt }

    offers.foldLeft(sum) { (acc, offer) => acc - offer.offer(fruits) }
  }
}
