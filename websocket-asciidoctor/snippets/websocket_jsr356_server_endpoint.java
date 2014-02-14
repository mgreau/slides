import javax.websocket.OnMessage;
import javax.websocket.ServerEndpoint;

@ServerEndpoint("/echo") // <1>
public class EchoServer {

	@OnMessage // <2>
	public String handleMessage(String message){
		return "Thanks for the message: " + message;
	}

}
