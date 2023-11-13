// Copyright (c) FIRST and other WPILib contributors.

// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj2.command.*;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.TankDriveCommand;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.MotorSubsystem;

import static frc.robot.Constants.*;


/**
 * The VM is configured to automatically run this class, and to call the methods corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
    public static DriveSubsystem driveSubsystem;
    public static CommandJoystick leftStick, rightStick;
    public static CommandXboxController xbox;
    public static RobotMode mode;
    private SendableChooser<RobotMode> chooser;

    public static MotorSubsystem modTalon1, modTalon2, modTalon3, modTalon4;

    /**
     * This method is run when the robot is first started up and should be used for any
     * initialization code.
     */
    @Override
    public void robotInit() {
        // Instantiate our RobotContainer.  This will perform all our button bindings, and put our
        // autonomous chooser on the dashboard.
        leftStick = new CommandJoystick(Constants.LEFT_STICK);
        rightStick = new CommandJoystick(Constants.RIGHT_STICK);
        xbox = new CommandXboxController(Constants.XBOX_CONTROLLER);
        driveSubsystem = new DriveSubsystem();

        modTalon1 = new MotorSubsystem(MOD_TALON_1);
        modTalon2 = new MotorSubsystem(MOD_TALON_2);
        modTalon3 = new MotorSubsystem(MOD_TALON_3);
        modTalon4 = new MotorSubsystem(MOD_TALON_4);

        mode = RobotMode.ROMULUS;

        chooser = new SendableChooser<>();
        chooser.addOption("Romulus", RobotMode.ROMULUS);
        chooser.addOption("Thor's Hammer", RobotMode.HAMMER);
        chooser.addOption("T-shirt Cannon", RobotMode.T_SHIRT);
        chooser.addOption("Frisbee Shooter", RobotMode.FRISBEE);


        new RobotContainer();
    }


    /**
     * This method is called every robot packet, no matter the mode. Use this for items like
     * diagnostics that you want ran during disabled, autonomous, teleoperated and test.
     *
     * <p>This runs after the mode specific periodic methods, but before LiveWindow and
     * SmartDashboard integrated updating.
     */
    @Override
    public void robotPeriodic() {
        // Runs the Scheduler.  This is responsible for polling buttons, adding newly-scheduled
        // commands, running already-scheduled commands, removing finished or interrupted commands,
        // and running subsystem periodic() methods.  This must be called from the robot's periodic
        // block in order for anything in the Command-based framework to work.
        CommandScheduler.getInstance().run();
    }

    @Override
    public void teleopInit() {

    }


    /**
     * This method is called once each time the robot enters Disabled mode.
     */
    @Override
    public void disabledInit() {}


    @Override
    public void disabledPeriodic() {}
    /**
     * This method is called periodically during operator control.
     */
    @Override
    public void teleopPeriodic() {}


    @Override
    public void testInit() {
        // Cancels all running commands at the start of test mode.
        CommandScheduler.getInstance().cancelAll();
    }


    /**
     * This method is called periodically during test mode.
     */
    @Override
    public void testPeriodic() {}
}
