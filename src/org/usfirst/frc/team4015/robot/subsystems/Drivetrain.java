package org.usfirst.frc.team4015.robot.subsystems;

import org.usfirst.frc.team4015.robot.RobotMap;
import org.usfirst.frc.team4015.robot.commands.Drive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/* ===================================================
 * This class contains the methods required to drive 
 * the robot with a tank drive chassis setup.
 * =================================================*/

public class Drivetrain extends Subsystem
{	
	// Declare Talons for driveing here
	// Declare "RobotDrive" class here (please read documentation on these classes)
	
	// DEFAULT CONSTRUCTOR //
	
	public Drivetrain()
	{
		// initialize Talons here
		// Initialize drivetrain object using RobotDrive constructor and Talons
	}
	
	// write methods to move the robot wheels using the RobotDrive object
	// make sure to include a method to stop the robot :)
	
	
	// don't worry about this
	public void initDefaultCommand()
	{
		// Set the default command for a subsystem here.
		setDefaultCommand(new Drive());
	}
}
