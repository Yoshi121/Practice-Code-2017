package org.usfirst.frc.team4015.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4015.robot.OI;
import org.usfirst.frc.team4015.robot.Robot;

/* ===================================================
 * This command moves the ramp up and down when button
 * 4 on the Attack 3 stick is pressed.
 * =================================================*/

// This command moves the ramp up and down using the pistons and pneumatics subsystem

public class MoveRamp extends Command
{
	public MoveRamp()
	{
		// Use requires() here to declare subsystem dependencies
		requires(Robot.pneumatics);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize()
	{
		// call method from pneumatics subsystem to set ramp to default starting position
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute()
	{
		// Use your pneumatics class methods to move the ramp when you press a Joystick button
		// HINT you will need to use the Joystick class from OI and an if statement
		// HINT use "Robot.pneumatics" to access the pneumatics class
		
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished()
	{
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end()
	{
		
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted()
	{
		
	}
}