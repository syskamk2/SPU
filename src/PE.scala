package syskamk2.SPU

abstract class PE(val coordinate:Tuple3[Int, Int, Int])
{
  def clock()
  protected def init()
  //$B%3%s%F%-%9%H@Z$jBX$((B
  protected def reconfigure()
  //$B%3%s%F%-%9%H%a%b%j$K=q$-9~$_(B
  protected def configure()
  def status()

  //$B1i;;<B9T(B/$BDd;_@)8f(B
  val EXEC_ON = 0
  val EXEC_OFF = 1
  protected var execMode = EXEC_OFF
}
