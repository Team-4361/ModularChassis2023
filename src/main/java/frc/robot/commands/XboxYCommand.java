package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.RobotMode;

public class XboxYCommand extends CommandBase{

    public XboxYCommand()
    {
        if (Robot.mode == RobotMode.FRISBEE) {
            
        } else if (Robot.mode == RobotMode.HAMMER) {
            addRequirements(Robot.modTalon1, Robot.modTalon2);
        } else if (Robot.mode == RobotMode.ROMULUS) {
            addRequirements(Robot.modTalon3);
        } else if (Robot.mode == RobotMode.T_SHIRT) {
            addRequirements(Robot.modTalon2);
        }
    }

    @Override
    public void execute(){
        if (Robot.mode == RobotMode.FRISBEE) {
            
        } else if (Robot.mode == RobotMode.HAMMER) {
            Robot.modTalon1.setPower(-1);
            Robot.modTalon2.setPower(-1);
        } else if (Robot.mode == RobotMode.ROMULUS) {
            Robot.modTalon3.setPower(1);
        } else if (Robot.mode == RobotMode.T_SHIRT) {
            Robot.modTalon2.setPower(0.45);
        }
    }
    @Override
    public void end(boolean interrupted){
        if (Robot.mode == RobotMode.FRISBEE) {
            
        } else if (Robot.mode == RobotMode.HAMMER) {
            Robot.modTalon1.setPower(0);
            Robot.modTalon2.setPower(0);
        } else if (Robot.mode == RobotMode.ROMULUS) {
            Robot.modTalon3.setPower(0);
        } else if (Robot.mode == RobotMode.T_SHIRT) {
            Robot.modTalon2.setPower(0);
        }
    }
    @Override
    public boolean isFinished(){
        return false;
    }
    
}
