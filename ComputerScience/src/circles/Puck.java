package circles;

public abstract class Puck extends Disk {
	public double weight;
	private boolean standard;
	private boolean youth;
	
	public Puck(double r, double t, double w) {
		super(1.5, 1);
		weight = w;
	}
		public void setWeight (double newWeight){
			weight = newWeight;
		}
		
		public double getWeight() {
			return (weight);
		}
		
		public boolean getDivision() {
			
			if (weight > 5 && weight < 5.5) {
				this.standard = true;
				this.youth = false;
				return standard;
				
				
			} else if (weight > 4 && weight < 4.5 ) {
				this.youth = true;
				this.standard = false;
				return youth;
		
			} else {
				return (Boolean) null;
		}
			
			
}
}