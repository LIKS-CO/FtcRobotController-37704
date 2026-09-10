package org.firstinspires.ftc.teamcode.kotlin.opmodes.teleop

import dev.nextftc.robot.Telemetry
import dev.nextftc.robot.opmode.NextOpMode
import dev.nextftc.robot.opmode.NextTeleop
import dev.nextftc.robot.triggers.CommandGamepad
import org.firstinspires.ftc.teamcode.kotlin.Robot

@NextTeleop(name = "Next Teleop")
class NextTeleop(val robot: Robot): NextOpMode(robot) {
    val coDriver = CommandGamepad(gamepad2)
    override fun start() {
        Telemetry.log("Started with nextftc")
        robot.chasis.startDrive(gamepad1)
        Telemetry.log("Started chasis")
    }

    override fun periodic() {
        robot.intake.setPower(coDriver.rightStickY.value)
    }
}