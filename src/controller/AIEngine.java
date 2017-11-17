package controller;

// Special engine for BOSS
public class AIEngine {
	   private static AIEngine instance = null;
	   
	   protected AIEngine() {} // Exists only to defeat instantiation.
	   
	   public static AIEngine getInstance() {
	      if(instance == null) {
	         instance = new AIEngine();
	      }
	      return instance;
	   }
	   
}