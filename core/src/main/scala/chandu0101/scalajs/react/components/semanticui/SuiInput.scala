package chandu0101.scalajs.react.components.semanticui

import chandu0101.macros.tojs.JSMacro
import chandu0101.macros.tojs.JSMacro._
import chandu0101.scalajs.react.components.sui._
import japgolly.scalajs.react.{React, ReactComponentU_, ReactElement, ReactNode}

import scala.scalajs.js
import scala.scalajs.js.|

case class SuiInput(
  key:            js.UndefOr[String]                                        = js.undefined,
  ref:            js.UndefOr[SuiInput => Unit]                              = js.undefined,
  as:             js.UndefOr[String | (Seq[ReactNode] => ReactComponentU_)] = js.undefined,
  action:         js.UndefOr[Boolean | (ReactNode | js.Object)]             = js.undefined,
  actionPosition: js.UndefOr[LeftRight]                                     = js.undefined,
  className:      js.UndefOr[String]                                        = js.undefined,
  disabled:       js.UndefOr[Boolean]                                       = js.undefined,
  error:          js.UndefOr[Boolean]                                       = js.undefined,
  focus:          js.UndefOr[Boolean]                                       = js.undefined,
  fluid:          js.UndefOr[Boolean]                                       = js.undefined,
  icon:           js.UndefOr[Boolean | (ReactNode | js.Object)]             = js.undefined,
  iconPosition:   js.UndefOr[LeftRight]                                     = js.undefined,
  inverted:       js.UndefOr[Boolean]                                       = js.undefined,
  input:          js.UndefOr[ReactNode | js.Object]                         = js.undefined,
  label:          js.UndefOr[ReactNode | js.Object]                         = js.undefined,
  labelPosition:  js.UndefOr[LeftRight]                                     = js.undefined,
  loading:        js.UndefOr[Boolean]                                       = js.undefined,
  size:           js.UndefOr[Size]                                          = js.undefined,
  transparent:    js.UndefOr[Boolean]                                       = js.undefined,
  `type`:         js.UndefOr[String]                                        = js.undefined
) {
  def apply(children: ReactNode*) = {
    val props = JSMacro[SuiInput](this)
    val f = React.asInstanceOf[js.Dynamic].createFactory(Sui.Input)
    if (children.isEmpty)
      f(props).asInstanceOf[ReactComponentU_]
    else if (children.size == 1)
      f(props, children.head).asInstanceOf[ReactComponentU_]
    else
      f(props, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}