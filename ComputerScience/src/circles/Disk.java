package circles;

public abstract class Disk extends Circle {
	private double thickness;
	
	
	public Disk(double r, double t) {
		super(r);
		thickness = t;
		
	}

	public void setThickness(double newThickness){
		thickness = newThickness;
	}
	
	public double getThickness(){
	return (thickness);
	}
	
	public double getVolume (double volume) {
		volume = super.getArea()*thickness;
		return (volume);
	}
	
	public boolean equals(Object d) {
		Disk testObj = (Disk) d;
		
		if (testObj.getRadius() == super.getRadius() && testObj.getThickness() == thickness) {
			return (true);
		} else {
		return false; 
		}
	}
	
	public String toString() {
		String diskString;
		
		diskString = "The disk has radius " + super.getRadius() + " and thickness " + thickness + ".";
		
		return (diskString);
	}
}

