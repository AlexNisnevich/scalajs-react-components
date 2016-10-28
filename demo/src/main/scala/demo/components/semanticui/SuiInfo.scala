package demo.components.semanticui

import chandu0101.scalajs.react.components.semanticui.{SuiGrid, SuiGridColumn, SuiGridRow, SuiHeader}
import demo.components.InfoTemplate
import japgolly.scalajs.react.ReactComponentB
import japgolly.scalajs.react.vdom.prefix_<^._

object SuiInfo {

  val component = ReactComponentB[Unit]("SuiInfo")
    .render(P => {
      InfoTemplate(componentFilePath = "semanticui/")(
        <.div(
          <.h3("semantic-ui "),
          SuiHeader(as = "h1")("hello world"),
          SuiGrid()(
            SuiGridRow()(
              SuiGridColumn(width = "five")(
                "hello world"
              ),
              SuiGridColumn(width = "five")(
                "tonite"
              ),
              SuiGridColumn(width = "five")(
                "world"
              )
            )
          )
        )
      )
    }).build

  def apply() = component()
}
