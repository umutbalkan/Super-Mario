package model;

public interface Model {
	
	Location loc = Location.getInstance();
	class Location {
		private static int x, y;
			
		private static class LocationHolder{
			public static Location instance = new Location();
		}
		public static Location getInstance() {
			return LocationHolder.instance;
		}
		
		public static void setX(int a){x = a;}
		public static void setY(int a){y = a;}
	}

	Location location();
}
