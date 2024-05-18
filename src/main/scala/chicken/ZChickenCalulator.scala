package chicken

import zio.*

object ZChickenCalulator {
  def easy = ZIO.succeed(1)
  def random(size: Int) =
    ZIO
      .foreach(1 to size)(_ => ZIO.random.flatMap(_.nextIntBetween(1, 100)))
      .map(_.toList)
}
