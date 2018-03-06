package fruits

case class Banana(origin: String) extends Fruit {
  override def pricesInEuro: Double = 1.5
}
