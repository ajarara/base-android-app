package io.ajarara.lib

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

internal class MyClassTest : StringSpec({
    "this test runs" {
        5 shouldBe 5
    }
/*
    "this test fails" {
        3 shouldBe 6
    }
*/
})