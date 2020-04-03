package dev.yogic.max

import org.scalatest._

class MaxSpec extends FunSuite with DiagrammedAssertions {
    test("Name should end with 'x'") {
        assert(Max.name.endsWith("x"))
    }
}
