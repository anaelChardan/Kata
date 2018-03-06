package offers

import fruits.Fruit

class GlobalOffer extends Offer {
  def offer(list: List[Fruit]): Int = (list.size / 5) * 100
}
