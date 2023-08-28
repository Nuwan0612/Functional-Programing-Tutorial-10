object Q1 {
    def calculateAverage(temperature: List[Int]): Double = {
      val fahrenheitTemperatures = temperature.map(celsius => (celsius * 9 / 5) + 32)
      val totalFahrenheit = fahrenheitTemperatures.reduce(_ + _)
      val avgFahrenheit = totalFahrenheit / temperature.length
      avgFahrenheit
    }

    def main(args: Array[String]): Unit = {
      val temp = List(0, 10, 20, 30)
      println("Average Fahrenheit temperature: " + calculateAverage(temp))
    }
}
