package model;

abstract class Model {
	int[] location = null;
	int x, y;
	
	int getX() {return x;}
	int getY() {return y;}
	void setX(int a) {x=a;}
	void setY(int a) {y=a;}
	
	// abstracts
	abstract int[] getLocation();
	abstract void setLocation(int x, int y);
}
