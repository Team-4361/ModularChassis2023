package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.RobotMode;

public class XboxBCommand extends CommandBase{
    
    public XboxBCommand(){
        if (Robot.mode == RobotMode.FRISBEE) {
            addRequirements(Robot.modTalon1);
        } else if (Robot.mode == RobotMode.HAMMER) {
            
        } else if (Robot.mode == RobotMode.ROMULUS) {
            addRequirements(Robot.modTalon2);
        } else if (Robot.mode == RobotMode.T_SHIRT) {
            
        }
    }
    @Override
    public void execute(){
        if (Robot.mode == RobotMode.FRISBEE) {
            Robot.modTalon1.setPower(1);
        } else if (Robot.mode == RobotMode.HAMMER) {
            
        } else if (Robot.mode == RobotMode.ROMULUS) {
            Robot.modTalon2.setPower(-1);
        } else if (Robot.mode == RobotMode.T_SHIRT) {

        }
    }
    @Override
    public void end(boolean interrupted){
        if (Robot.mode == RobotMode.FRISBEE) {
            Robot.modTalon1.setPower(0);
        } else if (Robot.mode == RobotMode.HAMMER) {
            
        } else if (Robot.mode == RobotMode.ROMULUS) {
            Robot.modTalon2.setPower(0);
        } else if (Robot.mode == RobotMode.T_SHIRT) {

        }
    }
    @Override
    public boolean isFinished(){
        return false;
    }
}
