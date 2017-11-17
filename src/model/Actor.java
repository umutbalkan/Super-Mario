package model;

abstract class Actor implements Movable {
	
	public void move(int x, int y) {
		loc = Location.getInstance();
	}
	
	public boolean collision() {
		return true;
	}
}
