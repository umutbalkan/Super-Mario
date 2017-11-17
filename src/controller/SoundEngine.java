package controller;

public class SoundEngine {
	   private static SoundEngine instance = null;
	   
	   protected SoundEngine() {} // Exists only to defeat instantiation.
	   
	   public static SoundEngine getInstance() {
	      if(instance == null) {
	         instance = new SoundEngine();
	      }
	      return instance;
	   }
}
