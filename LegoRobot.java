package pack;

import lejos.hardware.BrickFinder;
import lejos.hardware.Button;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3GyroSensor;

public class LegoRobot {
	
	private static EV3LargeRegulatedMotor leftMotor = new EV3LargeRegulatedMotor(BrickFinder.getDefault().getPort("B"));
	private static EV3LargeRegulatedMotor rightMotor = new EV3LargeRegulatedMotor(BrickFinder.getDefault().getPort("C"));
	private static EV3GyroSensor gyroSensor = new EV3GyroSensor(SensorPort.S2);
	
	private static float velocity = 700;
	private static float KP = 5;
	private static float KI = 0;
	private static float KD = 20;

	public static void main(String[] args) {
		
		float p, i, d, pid, deriv = 0, integ = 0, vleft, vright, initialAngle, currentAngle, error;
		
		float[] sample = new float[1];
		gyroSensor.getAngleMode().fetchSample(sample, 0);
		initialAngle = sample[0];
		
		
		while (!Button.ESCAPE.isDown()){
			
			gyroSensor.getAngleMode().fetchSample(sample, 0);
			currentAngle = sample[0];
			
			error = initialAngle - currentAngle;
			
			p = KP * error;
			
			d = KD * (error - deriv);
			
			deriv = error;
			
			integ += error;
					    
			i = KI * integ;

			pid = p + i + d;
			
			
			vleft = (velocity - pid);
			vright = (velocity + pid);

		    
		    leftMotor.setSpeed(vleft);
		    rightMotor.setSpeed(vright);

			leftMotor.forward();
			rightMotor.forward();

			
		}

		leftMotor.stop();
		rightMotor.stop();
		gyroSensor.close();
	}
	

}
