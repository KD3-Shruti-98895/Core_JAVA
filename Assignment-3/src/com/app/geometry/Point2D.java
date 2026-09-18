package com.app.geometry;

public class Point2D {
		private double x;
		private double y;
		public Point2D(double x, double y ) {
			this.x = x;
			this.y = y;
		}
		
//		public double getX() {
//			return x;
//		}
//
//		public double getY() {
//			return y;
//	    }
//		public void setX(double x) {
//			this.x = x;
//		}
//
//		public void setY(double y) {
//			this.y = y;
//	    }
 
		public String getDetails() {
			return "("+ this.x +","+ this.y +")";		
		}
		public boolean isEqual (Point2D other) {
		
		if (this.x == other.x && this.y == other.y ) {
				return true;
			}else {
				return false;
			}
		}
		
		public double calculateDistance (Point2D other) {
			double xsqr = this.x - other.x;
			double ysqr = this.y - other.y;
			return Math.hypot(xsqr, ysqr);
		}
		
	
}
