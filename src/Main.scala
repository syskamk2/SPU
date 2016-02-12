package syskamk2.SPU

object Main
{
  def main(args: Array[String])
  {
    val peArray:Seq[PE] = Seq(Exe(0, 0, 0), Exe(0, 1, 0))
    val controller:Controller = SimpleController(peArray) 
    controller.init()
  }
}
