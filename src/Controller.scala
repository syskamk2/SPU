package syskamk2.SPU

abstract class Controller(val PEArray:Seq[PE])
{
  //PEArray初期化
  def init()
  //コンテキストメモリに構成情報流し込み
  def program()
  //演算開始指示
  def execute()
  //コンテキスト切り替え指示
  def reconfigure()
  //演算停止指示
  def terminate()
}

