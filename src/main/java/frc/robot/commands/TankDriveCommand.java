package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.subsystems.DriveSubsystem;

public class TankDriveCommand extends CommandBase{
    public TankDriveCommand(){
        addRequirements(Robot.driveSubsystem);

    }
    
    @Override
    public void initialize(){
        
    }
    @Override
    public void execute(){
        Robot.driveSubsystem.tankDrive(Robot.leftStick.getY(), Robot.rightStick.getY());

    }
    @Override
    public boolean isFinished(){
        return false;
    }

}
