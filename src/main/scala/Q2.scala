object Q2 {

  def countLetterOccurrences(value: List[String]): Int = {
    val length = value.map(fruit => fruit.length)
    val totalCount = length.reduce(_+_)
    totalCount
  }

  def main(args: Array[String]): Unit = {
    val fruits = List("apple", "banana", "cherry", "date")
    println("Total count of letter occurrences: " + countLetterOccurrences(fruits))
  }
}
