package syskamk2.SPU

abstract class PE(val coordinate:Tuple3[Int, Int, Int])
{
  def init()
  def clock()
  def reconfigure()
  def configure()
  def status()
}
