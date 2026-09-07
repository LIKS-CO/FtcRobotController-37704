package org.firstinspires.ftc.teamcode.kotlin.opmodes.teleop

import dev.nextftc.robot.Telemetry
import dev.nextftc.robot.opmode.NextOpMode
import dev.nextftc.robot.opmode.NextTeleop
import org.firstinspires.ftc.teamcode.kotlin.Robot

@NextTeleop(name = "My Teleop")
class NextChasis(val robot: Robot): NextOpMode(robot) {
    override fun start() {
        Telemetry.log("Started with nextftc")
    }
    override fun periodic() {
        robot.chasis.startDrive(gamepad1)
    }
}