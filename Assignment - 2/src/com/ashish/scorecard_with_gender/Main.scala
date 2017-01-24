package com.ashish.scorecard_with_gender

/**
  * Created by ashish on 1/24/17.
  */
class Main {

}

object Main {
  def main(args: Array[String]): Unit = {

    val scoreCardCreator = new ScoreCardCreator

    /*--- Printing the male & female score card tuples ---*/
    println(scoreCardCreator.getScoreCardsByGender)
    scoreCardCreator.printScoreCardWithPercentage(50)
    scoreCardCreator.printMaleFemaleWithSameMarks
    scoreCardCreator.printDifferentGirls
  }
}
