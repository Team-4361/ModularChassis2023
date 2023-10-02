package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveSubsystem extends SubsystemBase{
    private WPI_TalonSRX fr, fl, br, bl;
    private MotorControllerGroup left, right;
    private DifferentialDrive drive;
    
    public DriveSubsystem(){
        fl = new WPI_TalonSRX(Constants.FRONT_LEFT); 
        fr = new WPI_TalonSRX(Constants.FRONT_RIGHT);
        bl = new WPI_TalonSRX(Constants.BACK_LEFT);
        br = new WPI_TalonSRX(Constants.BACK_RIGHT);
        left = new MotorControllerGroup(fl, bl);
        right = new MotorControllerGroup(fr, br);
        left.setInverted(Constants.LEFT_SIDE_INVERTED);
        right.setInverted(Constants.RIGHT_SIDE_INVERTED);
        drive = new DifferentialDrive(left, right);

        drive.setDeadband(0.05);


    }
    
}
