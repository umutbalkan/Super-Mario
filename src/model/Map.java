package model;

public class Map {
	   private static Map instance = null;
	   public static Map getInstance() {
	      if(instance == null) {
	         instance = new Map();
	      }
	      return instance;
	   }
}