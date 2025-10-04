
public class MathCalc {

	public static void main(String[] args) {
		
		double radius = 0.0;
		double circleArea = 100.0;
		int feet = 0;
		int inches = 0;
		
		radius = Math.sqrt(circleArea/Math.PI);
		feet = (int)Math.floor(radius);
		inches = (int)Math.round(12.0*(radius - feet));
		System.out.println("The radius of a circle with area " +
				circleArea
				+ " square feet is\n " + feet + " feet " + inches +
				 " inches");
		
		// Volume and Ratio
		
		double sunDiameter = 865000.0;
		double earthDiameter = 7600.0;
		
		double sunRadius = sunDiameter / 2.0;
		double earthRadius = earthDiameter / 2.0;
		
		double sunVolume = (4.0/3.0) * Math.PI * Math.pow(sunRadius, 3);
		double earthVolume = (4.0/3.0) * Math.PI * Math.pow(earthRadius, 3);
		double ratio = sunVolume / earthVolume;
		
		System.out.println("The volume of Earth is " + earthVolume + " cubic miles.");
		System.out.println("The volume of The Sun is " + sunVolume + " cubic miles.");
		System.out.println("The ratio of the volume of the Sun to the volume of Earth is " + ratio);



	}

}
