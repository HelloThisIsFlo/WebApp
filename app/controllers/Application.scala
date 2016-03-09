package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def dev = withParameter("Clean new project")

  def withParameter(name: String) = Action {
    Ok(views.html.index(name))
  }

}