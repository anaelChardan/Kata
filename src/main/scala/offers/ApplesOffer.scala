package offers

import fruits.{Apple, Fruit}

class ApplesOffer extends Offer {
  def offer(list: List[Fruit]) : Int = {
    var discount = list.collect({ case f: Apple => f }).size / 4 * 100

    val englishApples = list.collect({ case Apple("english") => Apple("english") })

    discount + englishDiscount(englishApples)
  }

  private def englishDiscount(englishApples: List[Fruit]): Int = {
    0
  }

}
