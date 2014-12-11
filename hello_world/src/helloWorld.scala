package our.examples
import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
 
class HelloActor extends Actor {
  def receive = {
    case "hello" => println("hello back at you")
    case _       => println("huh?")
  }
}
 
object HelloApp extends App {
	override def main(args: Array[String]){
		val system = ActorSystem("HelloSystem")
			// default Actor constructor
			val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")
			helloActor ! "hello"
			helloActor ! "buenos dias"
	}
}
