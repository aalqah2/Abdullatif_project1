package cosc455.towson.edu

/**
  * Created by ABDULLATIF on 13/11/2016.
  */

trait LexicalAnalyzer {
  def addChar() : Unit
  def getChar() : Char
  def getNextToken() : Unit
  def lookup() : Unit = {
    println("this is lookup implementation!")
  }
}
