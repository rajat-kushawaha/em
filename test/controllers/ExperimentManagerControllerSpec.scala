package controllers

import org.scalatestplus.play.guice.*
import org.scalatestplus.play.*
import play.api.test.*
import play.api.test.Helpers.*

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 *
 * For more information, see https://www.playframework.com/documentation/latest/ScalaTestingWithScalaTest
 */
class ExperimentManagerControllerSpec extends PlaySpec with GuiceOneAppPerTest with Injecting :

  "HomeController GET" should :

    "render the index page from a new instance of controller" in :
      val controller = new ExperimentManagerController(stubControllerComponents())
      val home = controller.index().apply(FakeRequest(GET, "/"))

      status(home) mustBe OK
      contentType(home) mustBe Some("text/plain")
      contentAsString(home) must include ("Welcome to Experiment Manager")

    "render the index page from the application" in :
      val controller = inject[ExperimentManagerController]
      val home = controller.index().apply(FakeRequest(GET, "/"))

      status(home) mustBe OK
      contentType(home) mustBe Some("text/plain")
      contentAsString(home) must include ("Welcome to Experiment Manager")

    "render the index page from the router" in :
      val request = FakeRequest(GET, "/")
      val home = route(app, request).get

      status(home) mustBe OK
      contentType(home) mustBe Some("text/plain")
      contentAsString(home) must include ("Welcome to Experiment Manager")

end ExperimentManagerControllerSpec
