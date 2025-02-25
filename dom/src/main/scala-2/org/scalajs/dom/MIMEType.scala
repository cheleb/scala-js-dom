package org.scalajs.dom

import scala.scalajs.js

@js.native
sealed trait MIMEType extends js.Any

object MIMEType {
  val `text/html`: MIMEType = "text/html".asInstanceOf[MIMEType]
  val `text/xml`: MIMEType = "text/xml".asInstanceOf[MIMEType]
  val `application/xml`: MIMEType = "application/xml".asInstanceOf[MIMEType]

  val `application/xhtml+xml`: MIMEType =
    "application/xhtml+xml".asInstanceOf[MIMEType]
  val `image/svg+xml`: MIMEType = "image/svg+xml".asInstanceOf[MIMEType]
}
