package org.firstinspires.ftc.teamcode.kotlin.mechanisms

import dev.nextftc.hardware.actuators.NextMotor
import dev.nextftc.robot.Mechanism

class Intake : Mechanism {
    val motor = NextMotor("intake")

    fun run(input: Double) = instant { motor.throttle = input }
}