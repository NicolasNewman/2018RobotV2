package org.usfirst.frc.team4500.robot.commands;

import org.usfirst.frc.team4500.robot.Robot;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class Auto_SwerveDrive extends TimedCommand {
	
	double x, y, z;
	
    public Auto_SwerveDrive(double x, double y, double z, int delay) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	super(delay);
    	this.x = x;
    	this.y = y;
    	this.z = z;
    	requires(Robot.swerve);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.swerve.calculateVectors(x, y, z);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return this.isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
