import mill._
import $ivy.`com.lihaoyi::mill-contrib-playlib:`,  mill.playlib._

object scalastarter extends PlayModule with SingleModule {

  def scalaVersion = "3.3.0-RC3"
  def playVersion = "2.9.0-M5"
  def twirlVersion = "1.6.0-RC2"

  object test extends PlayTests
}
