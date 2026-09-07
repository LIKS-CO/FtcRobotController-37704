package org.firstinspires.ftc.teamcode.kotlin.mechanisms

import com.qualcomm.robotcore.hardware.Gamepad
import dev.nextftc.hardware.actuators.NextMotor
import dev.nextftc.robot.Mechanism
import dev.nextftc.robot.drive.mecanumDrive

class Chasis: Mechanism {
    val frontLeft = NextMotor("LF")
    val frontRight = NextMotor("RF")
    val backLeft = NextMotor("LB")
    val backRight = NextMotor("RB")

    fun startDrive(gamepad: Gamepad) {
        mecanumDrive(frontLeft, frontRight, backLeft, backRight, gamepad).schedule()
    }
}