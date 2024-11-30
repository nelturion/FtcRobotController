package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "sample")
public class Auto0 extends LinearOpMode {
    //defines:
    BasicHardware hw = new BasicHardware(this);

    @Override
    public void runOpMode() {
        //init functions:
        hw.init(this);

        //run:
        waitForStart();
        if (opModeIsActive()) {
            hw.moveByTime(0.5, 0, 500);
            sleep(1000);
            hw.moveByTime(0, 0.5, 500);
            hw.stopp();
        }
    }
}
