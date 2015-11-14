package chandu0101.scalajs.react.components
package elementalui

import chandu0101.macros.tojs.JSMacro
import japgolly.scalajs.react._
import scala.scalajs.js
import scala.scalajs.js.`|`

case class Modal(
    className: js.UndefOr[String] = js.undefined,
    backdropClosesModal: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    onCancel: js.UndefOr[ReactEvent ⇒ Callback] = js.undefined,
    width: js.UndefOr[ModalWidth] = js.undefined) {

  def apply() = {
    val props = JSMacro[Modal](this)
    val f = React.asInstanceOf[js.Dynamic].createFactory(Eui.Modal)
    f(props).asInstanceOf[ReactComponentU_]
  }
}

case class ModalWidth private (val value: String) extends AnyVal
object ModalWidth {
  val SMALL = ModalWidth("small")
  val MEDIUM = ModalWidth("medium")
  val LARGE = ModalWidth("large")
}
