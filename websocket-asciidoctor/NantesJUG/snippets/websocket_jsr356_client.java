@ClientEndpoint
public class HelloClient {

	@OnMessage 
	public String message(String message){
		// traitement
	}
}

WebSocketContainer c = ContainerProvider.getWebSocketContainer();
c.connectToServer(HelloClient.class, "hello");
