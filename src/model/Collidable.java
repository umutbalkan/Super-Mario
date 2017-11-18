package model;

interface Collidable extends Model {
	
	boolean collision = false;
	
	// abstracts
	int[] getLocation();
	
	void setLocation(int x, int y);
}
