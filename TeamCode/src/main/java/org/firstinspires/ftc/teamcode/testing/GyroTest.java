package org.firstinspires.ftc.teamcode.testing;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.hardware.Sensors;

@Disabled
public class GyroTest extends LinearOpMode{
    Sensors gyro;
    @Override
    public void runOpMode() throws InterruptedException {
        gyro = new Sensors(this);
        waitForStart();
        while(opModeIsActive()){
            telemetry.addData("angle: ", gyro.getAngle());
            telemetry.update();
        }

    }
}
