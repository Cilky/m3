package engine.io;

import java.util.Map;

public class Connection {
	private Input target;
	private Map<String, String> args;
	
	public void run() { 
		target.run(args); 
	}
}
