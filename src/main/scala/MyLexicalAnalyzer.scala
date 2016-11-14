package cosc455.towson.edu

/**
  * Created by ABDULLATIF on 13/11/2016.
  */


class MyLexicalAnalyzer extends LexicalAnalyzer {
  override def addChar(): Unit = Unit

  //override def lookup(): Boolean = ???

  override def getNextToken(): Unit = {
    val c  = getChar()
  }

  override def getChar(): Char = ???


}
