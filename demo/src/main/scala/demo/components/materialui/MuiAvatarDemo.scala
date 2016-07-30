package demo.components
package materialui

import chandu0101.macros.tojs.GhPagesMacros
import chandu0101.scalajs.react.components.materialui._
import japgolly.scalajs.react.ReactComponentB
import japgolly.scalajs.react.vdom.prefix_<^._

object MuiAvatarDemo {
  val code = GhPagesMacros.exampleSource

  // EXAMPLE:START

  import Mui.Styles.colors
  import Mui.SvgIcons

  val component = ReactComponentB[Unit]("MuiAvatarDemo")
    .render(P => {
      <.div(
        CodeExample(code, "MuiAvatar")(
          MuiAvatar(backgroundColor = colors.grey700, color = colors.deepPurple200, icon = SvgIcons.ActionGrade()())(),
          MuiAvatar(size = 120, backgroundColor = colors.lime600)("Ø"),
          MuiAvatar()("one"),
          MuiAvatar()("two"),
          MuiAvatar(backgroundColor = colors.red400)(SvgIcons.ActionFace()())
        )
      )
    }).build

  // EXAMPLE:END

  def apply() = component()
}
