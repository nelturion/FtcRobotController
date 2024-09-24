package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class BasicHardware {
    private DcMotor LF, LR, RF, RR;
    //private Servo arm1;
    private double lf = 0, lr = 0, rf = 0, rr = 0;
    private LinearOpMode hwOpMode;

    public BasicHardware(LinearOpMode opMode) {
        hwOpMode = opMode;
    }

    public void init(LinearOpMode opMode) {
        LF.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        LR.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        RF.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        RR.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        LF.setDirection(DcMotorSimple.Direction.FORWARD);
        LR.setDirection(DcMotorSimple.Direction.FORWARD);
        RF.setDirection(DcMotorSimple.Direction.FORWARD);
        RR.setDirection(DcMotorSimple.Direction.FORWARD);

        opMode.telemetry.addLine("inited");
    }

    public void getControlInput() {
        double x = hwOpMode.gamepad1.left_stick_x;
        double y = hwOpMode.gamepad1.left_stick_y;

        lf = x + y;
        lr = -x + y;
        rf = x - y;
        rr = -x - y;
    }

    public void move() {
        LF.setPower(lf);
        LR.setPower(lr);
        RF.setPower(rf);
        RR.setPower(rr);
    }
}
