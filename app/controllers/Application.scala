package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def maintenance = Action { implicit request =>
    Ok(views.html.maintenance("shockn745@gmail.com"))
  }

  def dev = Action {
    Ok(views.html.index("Clean new project"))
  }

}