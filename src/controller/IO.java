package controller;

public class IO {
	   private static IO instance = null;
	   
	   protected IO() {} // Exists only to defeat instantiation.
	   
	   public static IO getInstance() {
	      if(instance == null) {
	         instance = new IO();
	      }
	      return instance;
	   }
}
