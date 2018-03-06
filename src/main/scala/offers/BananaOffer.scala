package offers

import fruits.{Banana, Fruit}

class BananaOffer extends Offer {
  def offer(list: List[Fruit]) : Int = list.collect({ case e: Banana => e}).size / 2 * 150
}
