package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.RobotMode;

public class XboxRightBumperCommand extends CommandBase{
    
    public XboxRightBumperCommand(){
        if (Robot.mode == RobotMode.FRISBEE) {
            
        } else if (Robot.mode == RobotMode.HAMMER) {
            
        } else if (Robot.mode == RobotMode.ROMULUS) {
            addRequirements(Robot.modTalon1);
        } else if (Robot.mode == RobotMode.T_SHIRT) {
            addRequirements(Robot.modTalon1);
        }
    }

    @Override
    public void execute(){
        if (Robot.mode == RobotMode.FRISBEE) {
           
        } else if (Robot.mode == RobotMode.HAMMER) {
            
        } else if (Robot.mode == RobotMode.ROMULUS) {
            Robot.modTalon1.setPower(1); 
        } else if (Robot.mode == RobotMode.T_SHIRT) {
            Robot.modTalon1.setPower(1);
        }
    }
    @Override
    public void end(boolean interrupted){
        if (Robot.mode == RobotMode.FRISBEE) {
           
        } else if (Robot.mode == RobotMode.HAMMER) {
            
        } else if (Robot.mode == RobotMode.ROMULUS) {
            Robot.modTalon1.setPower(0);
        } else if (Robot.mode == RobotMode.T_SHIRT) {
            Robot.modTalon1.setPower(0);
        }
    }
    @Override
    public boolean isFinished(){
        return false;
    }
}
