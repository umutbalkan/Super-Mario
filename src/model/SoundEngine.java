package model;

public class SoundEngine {

	private static SoundEngine engine = null;
	private SoundEngine() {}
	
	public static SoundEngine getEngine() {
		if(engine == null) engine = new SoundEngine();
		
		return engine;
	}
}
