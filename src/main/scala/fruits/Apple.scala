package fruits

case class Apple(origin: String) extends Fruit {
  override def pricesInEuro: Double = 1
}
