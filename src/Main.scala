package syskamk2.SPU

import syskamk2.SPU.SimplePE._

object Main
{
  def main(args: Array[String])
  {
    val peArray:Seq[PE] = Seq(SimpleExe(0, 0, 0), SimpleExe(0, 1, 0))
    val controller:Controller = SimpleController(peArray) 
    controller.init()
  }
}
