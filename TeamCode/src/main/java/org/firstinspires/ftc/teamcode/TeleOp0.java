package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Basic DT")
public class TeleOp0 extends LinearOpMode {
    //define
    private BasicHardware hw = new BasicHardware(this);

    @Override
    public void runOpMode() throws InterruptedException {
        hw.init(this);

        waitForStart();
        while (opModeIsActive()) {
            hw.getControlInput();
            hw.move();

            telemetry.addLine("runnin' runnin' runnin'...");
            telemetry.update();
        }
    }
}
