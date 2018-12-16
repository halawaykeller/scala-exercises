object SumOfMultiples {
  def sum(factors: Set[Int], limit: Int): Int = {
    val range = List.range(0, limit)
    factors.flatMap(i => range.map( _ * i)).filter( _ < limit).sum
  }
}


