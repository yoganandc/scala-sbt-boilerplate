package dev.yogic.min

import org.scalatest._

class MinSpec extends FunSuite with DiagrammedAssertions {
    test("Name should start with 'M'") {
        assert(Min.name.startsWith("M"))
    }
}
