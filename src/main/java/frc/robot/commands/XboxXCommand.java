package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.RobotMode;

public class XboxXCommand extends CommandBase{

    public XboxXCommand()
    {
        if (Robot.mode == RobotMode.FRISBEE) {
            addRequirements(Robot.modTalon2);
        } else if (Robot.mode == RobotMode.HAMMER) {
            
        } else if (Robot.mode == RobotMode.ROMULUS) {
            
        } else if (Robot.mode == RobotMode.T_SHIRT) {

        }
    }

    @Override
    public void execute() {
        Robot.modTalon2.setPower(1);
    }

    @Override
    public void end(boolean interrupted) {
        Robot.modTalon2.setPower(0);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
    
}
