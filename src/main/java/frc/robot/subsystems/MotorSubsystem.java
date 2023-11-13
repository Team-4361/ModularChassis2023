package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Subsystem;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class MotorSubsystem extends SubsystemBase {
    private final WPI_TalonSRX motor;
    private final int device;

    public MotorSubsystem(int deviceNumber){
        motor = new WPI_TalonSRX(deviceNumber);
        device = deviceNumber;
    }

    @Override 
    public void periodic() {
        SmartDashboard.putNumber("Motor Power " + device, getPower());
    }

    public void setPower(double power)
    {
        motor.set(power);
    }
    public double getPower(){
        return motor.get();
    }
}
