package controller;

public class GraphicsEngine {
	   private static GraphicsEngine instance = null;
	   
	   protected GraphicsEngine() {} // Exists only to defeat instantiation.
	   
	   public static GraphicsEngine getInstance() {
	      if(instance == null) {
	         instance = new GraphicsEngine();
	      }
	      return instance;
	   }
		   
}
