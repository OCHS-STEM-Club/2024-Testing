// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MotorConstants;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;;

public class MotorSubsystem extends SubsystemBase {
  /** Creates a new MotorSubsystem. */
  private CANSparkMax motor;
  public MotorSubsystem() {
    motor = new CANSparkMax(MotorConstants.motorMotorID, MotorType.kBrushless);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void motorOn() {
    motor.set(0.5);
  }

  public void motorOff() {
    motor.set(0);
  }
}
