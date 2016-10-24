package chandu0101.scalajs.react.components.semanticui

import chandu0101.macros.tojs.JSMacro
import japgolly.scalajs.react.{React, ReactComponentU_, ReactNode}

import scala.scalajs.js

/**
  * Created by thom on 10/23/16.
  */
case class SuiGridRow(
  key:      js.UndefOr[String]        = js.undefined,
  ref:      js.UndefOr[String]        = js.undefined,
  as:       js.UndefOr[String]        = js.undefined
) {
  def apply(children: ReactNode*) = {
    val props = JSMacro[SuiGridRow](this)
    val f = React.asInstanceOf[js.Dynamic].createFactory(Sui.GridRow)
    if (children.isEmpty)
      f(props).asInstanceOf[ReactComponentU_]
    else if (children.size == 1)
      f(props, children.head).asInstanceOf[ReactComponentU_]
    else
      f(props, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}