package engine.io;

import java.util.List;

public class Output {
	private List<Connection> connections;
	
	public void connect(Connection c) { 
		connections.add(c); 
	}
	
	public void run() { 
		for (Connection c : connections) {
			c.run(); 
		}
	}
}
