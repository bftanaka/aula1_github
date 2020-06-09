package entities;

public class _001_Rectangle {

	public double width;
	public double height;
	
	double area;
	double perimeter;
	double diagonal;

	
		public double area() {
			area = width * height;
			return area;
		}	

		public double perimeter() {
			perimeter = (width + height) * 2;
			return perimeter;
		}	
		
		public double diagonal() {
			diagonal = Math.sqrt((Math.pow(width,2) + Math.pow(height,2)));
			return diagonal;
		}	
	}

