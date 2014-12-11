package akka.tutorial
import akka.actor._
import scala.concurrent._
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

object Futures extends App{
	implicit val system = ActorSystem("FutureSystem")
	val future = Future {
		1+1
	}
	val du = Duration(1000, "millis")
	val result = Await.result(future, du)
	println(result)
}
