package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait ReferrerPolicy extends js.Any

object ReferrerPolicy {
  val empty: ReferrerPolicy = "".asInstanceOf[ReferrerPolicy]
  val `no-referrer`: ReferrerPolicy = "no-referrer".asInstanceOf[ReferrerPolicy]

  val `no-referrer-when-downgrade`: ReferrerPolicy =
    "no-referrer-when-downgrade".asInstanceOf[ReferrerPolicy]
  val `origin-only`: ReferrerPolicy = "origin-only".asInstanceOf[ReferrerPolicy]

  val `origin-when-cross-origin`: ReferrerPolicy =
    "origin-when-cross-origin".asInstanceOf[ReferrerPolicy]
  val `unsafe-url`: ReferrerPolicy = "unsafe-url".asInstanceOf[ReferrerPolicy]
}
