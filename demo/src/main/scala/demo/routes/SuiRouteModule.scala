package demo.routes

import demo.pages.SuiPage
import demo.components.semanticui.SuiInfo
import japgolly.scalajs.react.extra.router.RouterConfigDsl

object SuiRouteModule {
  case object Info extends LeftRoute("Info", "info", () => SuiInfo())

  val menu: List[LeftRoute] = List(
    Info
  )

  val routes = RouterConfigDsl[LeftRoute].buildRule { dsl =>
    import dsl._
    menu
      .map(i => staticRoute(i.route, i) ~> renderR(r => SuiPage(i, r)))
      .reduce(_ | _)
  }
}
