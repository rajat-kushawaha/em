package controllers

import play.api.*
import play.api.mvc.*
import play.api.libs.json.*

import javax.inject.*

@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController:

  def index(): Action[AnyContent] = Action:
    implicit request: Request[AnyContent] =>
      Ok("Welcome to Experiment Manager")

end HomeController
