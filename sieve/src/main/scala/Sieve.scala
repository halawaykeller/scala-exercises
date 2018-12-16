object Sieve {
  def factors(num: Int): Seq[Int] = (2 to num).filter(num % _ == 0)
  def isPrime(num: Int): Boolean = factors(num).equals(List(num))
  def primes(num: Int): Seq[Int] = (2 to num).filter(isPrime)
}
