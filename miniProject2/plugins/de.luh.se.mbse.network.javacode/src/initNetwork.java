
public class initNetwork {

	public static void main(String[] args) {
		// Define our network, Cafe
		Network cafe = new Network("Cafe");
		
		// define the channels
		Channel c1 = new Channel("orderCoffe", "Asynchronous");
		Channel c2 = new Channel("deliverCoffe","Asynchronous");
		Channel c3 = new Channel("payCoffe","Asynchronous");
		
		Statemachine guest = new Statemachine("guest");
		State waiting = new State("waiting");
		State drinkingCoffe = new State("drinking Coffe");
		guest.addState(waiting);
		guest.addState(drinkingCoffe);
		
		// Initialize the network
		cafe.initialization();
	}

}
