object Leap {
  def isDivisible(x: Int)(y: Int): Boolean = x % y == 0
  def divBy4: Int => Boolean = isDivisible(_)(4)
  def divBy100: Int => Boolean = isDivisible(_)(100)
  def divBy400: Int => Boolean = isDivisible(_)(400)
  def leapYear(year: Int): Boolean = (divBy4(year) && !divBy100(year)) || divBy400(year)
}
