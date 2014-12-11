package remote
import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

class RemoteActor extends Actor{
	def receive = {
		case msg:String =>
			println(s"RemoteActor received message '$msg'")
			sender ! "hello from RemoteActor"
	}
}

object HelloRemote extends App{
	val system = ActorSystem("HelloRemoteSystem")
	val remoteActor = system.actorOf(Props[RemoteActor], name="RemoteActor")
	remoteActor ! "The remote actor is alive"
}

