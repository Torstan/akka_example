package client 
import akka.actor._

object HelloLocal extends App{
	implicit val system = ActorSystem("LocalSystem")
	val localActor = system.actorOf(Props[LocalActor], name="LocalActor")
	localActor ! "START"
}

class LocalActor extends Actor{
	val remote = context.actorFor("akka://HelloRemoteSystem@172.27.6.240:5150/user/RemoteActor")
	var counter = 0
	def receive = {
		case "START" =>
			remote ! "HELLO from the LocalActor"
		case msg:String =>
			println(s"LocalActor received message: '$msg'")
			if(counter < 5){
				sender ! "hello back to you"
				counter += 1
			}
	}
}
