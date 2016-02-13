package syskamk2.SPU.SimplePE

import syskamk2.SPU._

object SimpleBus extends Bus
{
  val BROADCAST = (-1, -1, -1)
  private var address = (0, 0, 0);
  private var data = 0;
  //一方通行にしないならアービターとか必要
  def write(pa:BusPassenger, a:(Int, Int, Int), d:Int)
  {
    pa match 
    {
      case _:PE =>
      case _:Controller =>
      {
        address = a
        data = d
      }
    }
  }
  def read():((Int, Int, Int), Int) =
  {
    (address, data)
  }
}

