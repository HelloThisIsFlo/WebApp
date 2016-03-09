package gettingused

import play.api.test._

/**
  * See : https://www.playframework.com/documentation/2.5.x/ScalaFunctionalTestingWithSpecs2
  */
class FunctionalTest extends PlaySpecification {

  "Testing template rendering => render maintenance template" in {
    val html = views.html.maintenance("Coco")

    contentType(html) must equalTo("text/html")
    contentAsString(html) must contain("Coco")
  }

  "Testing call to Action => respond to the index Action" in {
    val result = controllers.Application.withParameter("Bob")(FakeRequest())

    status(result) must equalTo(OK)
    contentType(result) must beSome("text/html")
    charset(result) must beSome("utf-8")
  }

  "Testing Routing => respond to the dev Action" in new WithApplication {
    val Some(result) = route(FakeRequest(GET, "/dev"))

    status(result) must equalTo(OK)
    contentType(result) must beSome("text/html")
    charset(result) must beSome("utf-8")
    contentAsString(result) must contain("Clean new project")
  }

}
