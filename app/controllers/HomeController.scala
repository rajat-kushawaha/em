package controllers

import play.api.*
import play.api.libs.json.*
import play.api.mvc.*

import javax.inject.*

@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController:

  def index(): Action[AnyContent] = Action:
    implicit request: Request[AnyContent] =>
      Ok("Welcome to Experiment Manage")

end HomeController
