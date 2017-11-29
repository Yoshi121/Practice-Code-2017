package org.usfirst.frc.team4015.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4015.robot.Robot;
import org.usfirst.frc.team4015.robot.OI;

/* ===================================================
 * This command spins the winch to climb up the rope.
 * The winch is controlled by button 5 on the Logitech
 * Attack 3 joystick
 * =================================================*/

public class ClimbRope extends Command
{
	public ClimbRope()
	{
		requires(Robot.winch);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize()
	{
		
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute()
	{
		// spin winch when switch is pressed
		if (Robot.winch.limitSwitch.get() == true)
		{
			Robot.winch.spin();
		}
		else
		{
			Robot.winch.stop();
		}
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