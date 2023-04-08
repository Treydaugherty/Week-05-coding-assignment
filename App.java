package Week05CodingAssignment;

public class App {
	public static void main(String[] args) {
		
		AsteriskLogger asterisklogger = new AsteriskLogger();
		asterisklogger.log("Hello");
		
		asterisklogger.error("Goodbye");
		
		
		SpacedLogger spacedlogger = new SpacedLogger();
		spacedlogger.log("Hello");
		
		spacedlogger.error("Goodbye");
	
		
		
	}

}
