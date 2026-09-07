package org.firstinspires.ftc.teamcode.kotlin

import dev.nextftc.robot.Mechanism
import dev.nextftc.robot.NextRobot
import org.firstinspires.ftc.teamcode.kotlin.mechanisms.Chasis

class Robot: NextRobot {
    val chasis = Chasis()

    override val mechanisms = setOf(chasis)
}
