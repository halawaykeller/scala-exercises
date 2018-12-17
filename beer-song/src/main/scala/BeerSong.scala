object BeerSong {
  def recite(startB: Int, verseNum: Int): Seq[Char] = {
    (1 to verseNum).map(verse(startB, startB)._1)
  }

  def verse(bottles: Int, remBottles: Int): (String, Int) = (bottles.toString ++
                                    " bottles of beer on the wall, "++
                                    bottles.toString ++
                                    " bottles of beer.\nTake one down and pass it around, " ++
                                    (bottles-1).toString ++
                                    " bottles of beer on the wall.\n", bottles-1)

}
