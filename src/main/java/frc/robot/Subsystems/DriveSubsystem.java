// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

/** Add your docs here. */
public class DriveSubsystem extends SubsystemBase {


  //  public WPI_VictorSPX rightMaster = new WPI_VictorSPX(Constants.rightMotor);
  //  public WPI_VictorSPX leftMaster = new WPI_VictorSPX(Constants.leftMotor);
    public PWMVictorSPX leftMaster = new PWMVictorSPX(Constants.leftMotor);
    public PWMVictorSPX rightMaster = new PWMVictorSPX(Constants.rightMotor);



    public DriveSubsystem(){

        // rightFollower.follow(rightMaster);
        // leftFollower.follow(leftMaster);
        //drive = new DifferentialDrive(leftMaster, rightMaster);
      }
      public void rotate(double speed){
        leftMaster.set(speed);
        rightMaster.set(speed);

      }


      public void arcade(double move, double turn){
        //drive.arcadeDrive(move, turn);
      }
    
      public void tank(double left, double right)
      {
        //drive.tankDrive(left, right);
      }
}
