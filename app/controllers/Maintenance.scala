package controllers

import controllers.Application._
import play.api.mvc.Action

object Maintenance {

  def main = Action { implicit request =>
    Ok(views.html.maintenance("shockn745@gmail.com"))
  }

}
