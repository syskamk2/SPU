package syskamk2.SPU

abstract class PE(val coordinate:Tuple3[Int, Int, Int])
{
  def clock()
  protected def init()
  protected def reconfigure()
  protected def configure()
  def status()

  val EXEC_ON = 0
  val EXEC_OFF = 1
  protected var execMode = EXEC_OFF
}
