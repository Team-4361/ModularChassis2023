package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.commands.TankDriveCommand;

public class DriveSubsystem extends SubsystemBase {
    private WPI_TalonSRX fr, fl, br, bl;
    private MotorControllerGroup leftSide, rightSide;
    private DifferentialDrive drive;
    
    public DriveSubsystem(){
        fl = new WPI_TalonSRX(Constants.DRIVE_FRONT_LEFT);
        fr = new WPI_TalonSRX(Constants.DRIVE_FRONT_RIGHT);
        bl = new WPI_TalonSRX(Constants.DRIVE_BACK_LEFT);
        br = new WPI_TalonSRX(Constants.DRIVE_BACK_RIGHT);

        leftSide = new MotorControllerGroup(fl, bl);
        rightSide = new MotorControllerGroup(fr, br);

        leftSide.setInverted(Constants.LEFT_SIDE_INVERTED);
        rightSide.setInverted(Constants.RIGHT_SIDE_INVERTED);

        drive = new DifferentialDrive(leftSide, rightSide);
        drive.setDeadband(0.05);
        setDefaultCommand(new TankDriveCommand());
    }
    
    public void tankDrive(double leftInput, double rightInput){
        drive.tankDrive(leftInput, rightInput);
    }
}
