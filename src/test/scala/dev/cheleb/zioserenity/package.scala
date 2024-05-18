package dev.cheleb.zioserenity

import zio.*

val runtime = Runtime.default
extension [E, A](a: ZIO[Any, E, A])
  def run: A =
    Unsafe.unsafe { implicit unsafe =>
      runtime.unsafe.run(a).getOrThrowFiberFailure()
    }
