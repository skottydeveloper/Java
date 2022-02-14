/* 
-  Your company is doing some consulting work and the client has asked for a new, more exciting version of their existing Triangle. They want a Triangle, but with an extra side, which they're calling Triangle 2.0.
-  To meet the specification you need to create a class called Rectangle with the following methods:
    -  A no-parameter constructor that sets all side lengths to 1.
    -  A one parameter constructor that takes an int, and sets all side lengths to that value.
    -  A two parameter constructor, that takes two ints, and sets two opposite sides to one length, and the other pair of opposite sides to the other length.
    -  A method getShortSide that takes no parameters and returns the length of the shortest side as an int.
    -  A method getLongSide that takes no parameters and returns the length of the longest side as an int.
    -  A method isSquare that takes no parameters and returns true if the rectangle is a square, and false otherwise.
    -  A method area that takes no parameters and returns the area of the rectangle as an int.
    -  A method diagonal that takes no parameters and returns the length of the diagonals as a double. The library function Math.sqrt(double) may be useful here.
    -  A method bigger that takes a Rectangle as a parameter and returns true if the current Rectangle has an area strictly greater than the area of one given in the parameter. */

class Rectangle {
	private int sl1;
	private int sl2;

	public Rectangle() {
		this.sl1 = 1;
		this.sl2 = 1;	
	}

	public Rectangle(int one) {
		this.sl1 = one;
		this.sl2 = one;
	}

	public Rectangle(int one, int two) {
		this.sl1 = one;
		this.sl2 = two;
	}

	public int getShortSide() {
		if (this.sl1 > this.sl2) {
			return this.sl2;
		} else {
			return this.sl1;
		}
	}

	public int getLongSide() {
		if (this.sl1 > this.sl2) {
			return this.sl1;
		} else {
			return this.sl2;
		}
	}

	public boolean isSquare() {
		if (sl1 == sl2) {
			return true;
		} else {
			return false;
		}
	}

	public int area() {
		return sl1 * sl2;
	}

	public double diagonal() {
		return Math.sqrt(sl1 * sl1 + sl2 * sl2);
	}

	public boolean bigger(Rectangle Rect1) {
		if (Rect1.area() < this.area()) {
			return true;
		} else {
			return false;
		}
	}
}