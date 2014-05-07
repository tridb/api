package net.tridb.controllers

import play.api._
import play.api.mvc._
import play.api.libs.json._

object Application extends Controller {

  def index = Action { request =>
    Ok(Json.obj(
      "status" -> "OK",
      "name" -> Play.current.configuration.getString("application.name"),
      "version" -> Play.current.configuration.getString("application.version")
    ))
  }

}
