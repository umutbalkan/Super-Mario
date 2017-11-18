package model;

public class PhysicsEngine {
	private static PhysicsEngine engine = null;
	private PhysicsEngine() {}
	
	public static PhysicsEngine getEngine() {
		if(engine == null) engine = new PhysicsEngine();
		
		return engine;
	}
}
