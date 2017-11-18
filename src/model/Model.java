package model;

interface Model {
	int[] location = null;
	int x = 0;
	int y = 0;
	
	int getX();
	int getY();
	void setX(int a);
	void setY(int a);
	int[] getLocation();
	void setLocation(int x, int y);
}
