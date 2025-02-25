package org.scalajs.dom

import scala.scalajs.js

/** Fetch APIs [[https://fetch.spec.whatwg.org/#requestcache RequestCache enum]] */
@js.native
sealed trait RequestCache extends js.Any

object RequestCache {
  val default: RequestCache = "default".asInstanceOf[RequestCache]
  val `no-store`: RequestCache = "no-store".asInstanceOf[RequestCache]
  val reload: RequestCache = "reload".asInstanceOf[RequestCache]
  val `no-cache`: RequestCache = "no-cache".asInstanceOf[RequestCache]
  val `force-cache`: RequestCache = "force-cache".asInstanceOf[RequestCache]
  val `only-if-cached`: RequestCache = "only-if-cached".asInstanceOf[RequestCache]
}
