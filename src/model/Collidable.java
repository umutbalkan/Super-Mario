package model;

abstract class Collidable extends Model {
	
	private boolean collision;
	
	// abstracts
	int[] getLocation() {
		
		return location;
	}
	
	void setLocation(int x, int y) {
		
	}
}
