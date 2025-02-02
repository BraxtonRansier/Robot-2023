// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.autos;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.commands.TeleopSwerve;
import frc.robot.subsystems.Swerve;

public class TestAuto extends CommandBase {
  /** Creates a new TestAuto. */
  private final Swerve m_swerve;
  public TestAuto(Swerve swerve) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.m_swerve = swerve;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_swerve.drive(
      new Translation2d(.5, 0).times(Constants.Swerve.maxSpeed), 
      0 * -1 * Constants.Swerve.maxAngularVelocity, 
      false, 
      true
  );
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
