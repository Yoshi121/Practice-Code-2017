package org.usfirst.frc.team4015.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.DigitalInput;

/* ===================================================
 * This class contains the methods required to control
 * the winch.
 * =================================================*/

public class Winch extends Subsystem
{ 
	public Spark winchMotors;
	public DigitalInput limitSwitch; // limit switch
	
	public Winch()
	{
		winchMotors = new Spark(9);
		limitSwitch = new DigitalInput(0);  // limit switch
	}
	
	// STOP WINCH //
	
	public void stop()
	{
		winchMotors.set(0);
	}
	
	// SPIN WINCH TO REEL IN ROPE //
	
	public void spin()
	{
		winchMotors.set(-1);
	}
	
	public void initDefaultCommand()
	{
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}