package model;

public class Map {
	   private static Map instance = null;
	   protected Map() {} // Exists only to defeat instantiation.
	   public static Map getInstance() {
	      if(instance == null) {
	         instance = new Map();
	      }
	      return instance;
	   }
}