package offers

import fruits.{Cherry, Fruit}

class CherryOffer extends Offer {
  def offer(list: List[Fruit]) : Int = list.collect({case e: Cherry => e}).size / 2 * 20
}
