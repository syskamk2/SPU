package syskamk2.SPU

abstract class PE(val coordinate:Tuple3[Int, Int, Int])
{
  def clock()
  protected def init()
  //コンテキスト切り替え
  protected def reconfigure()
  //コンテキストメモリに書き込み
  protected def configure()
  def status()

  //演算実行/停止制御
  val EXEC_ON = 0
  val EXEC_OFF = 1
  protected var execMode = EXEC_OFF
}
