// !LANGUAGE: +AllowContractsForCustomFunctions +UseReturnsEffect
// !DIAGNOSTICS: -INVISIBLE_REFERENCE -INVISIBLE_MEMBER
// !USE_EXPERIMENTAL: kotlin.contracts.ExperimentalContracts

/*
 KOTLIN DIAGNOSTICS NOT LINKED SPEC TEST (POSITIVE)

 SECTION: contracts
 CATEGORY: analysis, smartcasts
 NUMBER: 4
 DESCRIPTION: Smartcasts using Returns effects with simple type checking and not-null conditions on receiver inside contract.
 */

// FILE: contracts.kt

package contracts

import kotlin.contracts.*

fun <T> T.case_1() {
    contract { returns() implies (this@case_1 is String) }
    if (!(this@case_1 is String)) throw Exception()
}

fun <T : Number> T.case_2() {
    contract { returns() implies (this@case_2 is Int) }
    if (!(this@case_2 is Int)) throw Exception()
}

fun <T : <!FINAL_UPPER_BOUND!>String<!>> T?.case_3_1() {
    contract { returns() implies (this@case_3_1 != null) }
    if (!(this@case_3_1 != null)) throw Exception()
}
fun <T : <!FINAL_UPPER_BOUND!>String<!>> T?.case_3_2() {
    contract { returns() implies (this@case_3_2 == null) }
    if (!(this@case_3_2 == null)) throw Exception()
}

fun <T : String?> T.case_4_1() {
    contract { returns() implies (this@case_4_1 != null) }
    if (!(this@case_4_1 != null)) throw Exception()
}
fun <T : String?> T.case_4_2() {
    contract { returns() implies (this@case_4_2 == null) }
    if (!(this@case_4_2 == null)) throw Exception()
}

fun <T> T.case_5_1(): Boolean {
    contract { returns(true) implies (this@case_5_1 is String) }
    return this@case_5_1 is String
}
fun <T> T.case_5_2(): Boolean {
    contract { returns(false) implies (this@case_5_2 is String) }
    return !(this@case_5_2 is String)
}
fun <T> T.case_5_3(): Boolean? {
    contract { returnsNotNull() implies (this@case_5_3 is String) }
    return if (this@case_5_3 is String) true else null
}
fun <T> T.case_5_4(): Boolean? {
    contract { returns(null) implies (this@case_5_4 is String) }
    return if (this@case_5_4 is String) null else true
}

fun <T : Number> T.case_6_1(): Boolean {
    contract { returns(true) implies (this@case_6_1 is Int) }
    return this@case_6_1 is Int
}
fun <T : Number> T.case_6_2(): Boolean {
    contract { returns(false) implies (this@case_6_2 is Int) }
    return !(this@case_6_2 is Int)
}
fun <T : Number> T.case_6_3(): Boolean? {
    contract { returnsNotNull() implies (this@case_6_3 is Int) }
    return if (this@case_6_3 is Int) true else null
}
fun <T : Number> T.case_6_4(): Boolean? {
    contract { returns(null) implies (this@case_6_4 is Int) }
    return if (this@case_6_4 is Int) null else true
}

fun <T : <!FINAL_UPPER_BOUND!>String<!>> T?.case_7_1(): Boolean {
    contract { returns(true) implies (this@case_7_1 != null) }
    return this@case_7_1 != null
}
fun <T : <!FINAL_UPPER_BOUND!>String<!>> T?.case_7_2(): Boolean {
    contract { returns(true) implies (this@case_7_2 == null) }
    return this@case_7_2 == null
}
fun <T : <!FINAL_UPPER_BOUND!>String<!>> T?.case_7_3(): Boolean? {
    contract { returnsNotNull() implies (this@case_7_3 == null) }
    return if (this@case_7_3 == null) true else null
}
fun <T : <!FINAL_UPPER_BOUND!>String<!>> T?.case_7_4(): Boolean? {
    contract { returns(null) implies (this@case_7_4 == null) }
    return if (this@case_7_4 == null) null else true
}
fun <T : <!FINAL_UPPER_BOUND!>String<!>> T?.case_7_5(): Boolean {
    contract { returns(false) implies (this@case_7_5 == null) }
    return !(this@case_7_5 == null)
}
fun <T : <!FINAL_UPPER_BOUND!>String<!>> T?.case_7_6(): Boolean? {
    contract { returnsNotNull() implies (this@case_7_6 != null) }
    return if (this@case_7_6 != null) true else null
}
fun <T : <!FINAL_UPPER_BOUND!>String<!>> T?.case_7_7(): Boolean? {
    contract { returns(null) implies (this@case_7_7 != null) }
    return if (this@case_7_7 != null) null else true
}
fun <T : <!FINAL_UPPER_BOUND!>String<!>> T?.case_7_8(): Boolean {
    contract { returns(false) implies (this@case_7_8 != null) }
    return !(this@case_7_8 != null)
}
fun <T : <!FINAL_UPPER_BOUND!>String<!>> T?.case_7_9(): Boolean {
    contract { returns(false) implies (this@case_7_9 == null) }
    return !(this@case_7_9 == null)
}
fun <T : <!FINAL_UPPER_BOUND!>String<!>> T?.case_7_10(): Boolean? {
    contract { returnsNotNull() implies (this@case_7_10 == null) }
    return if (this@case_7_10 == null) true else null
}
fun <T : <!FINAL_UPPER_BOUND!>String<!>> T?.case_7_11(): Boolean? {
    contract { returns(null) implies (this@case_7_11 == null) }
    return if (this@case_7_11 == null) null else true
}

fun <T : String?> T.case_8_1(): Boolean {
    contract { returns(true) implies (this@case_8_1 != null) }
    return this@case_8_1 != null
}
fun <T : String?> T.case_8_2(): Boolean {
    contract { returns(true) implies (this@case_8_2 == null) }
    return this@case_8_2 == null
}
fun <T : String?> T.case_8_3(): Boolean? {
    contract { returnsNotNull() implies (this@case_8_3 == null) }
    return if (this@case_8_3 == null) true else null
}
fun <T : String?> T.case_8_4(): Boolean? {
    contract { returns(null) implies (this@case_8_4 == null) }
    return if (this@case_8_4 == null) null else true
}

fun <T : Number?> T.case_9_1(): Boolean? {
    contract { returnsNotNull() implies (this@case_9_1 != null) }
    return if (this@case_9_1 != null) true else null
}
fun <T : Number?> T.case_9_2(): Boolean? {
    contract { returns(null) implies (this@case_9_2 != null) }
    return if (this@case_9_2 != null) null else true
}

fun <T : Number?> T.case_10_1(): Boolean? {
    contract { returns(null) implies (this@case_10_1 != null) }
    return if (this@case_10_1 != null) null else true
}
fun <T : Number?> T.case_10_2(): Boolean? {
    contract { returns(null) implies (this@case_10_2 != null) }
    return if (this@case_10_2 != null) null else true
}

// FILE: usages.kt

import contracts.*

fun case_1(value_1: Any?) {
    value_1.case_1()
    println(<!DEBUG_INFO_SMARTCAST!>value_1<!>.length)
}

fun case_2(value_1: Number) {
    value_1.case_2()
    println(<!DEBUG_INFO_SMARTCAST!>value_1<!>.inv())
}

fun case_3(value_1: String?, value_2: String?) {
    value_1.case_3_1()
    println(<!DEBUG_INFO_SMARTCAST!>value_1<!>.length)
    value_2.case_3_2()
    println(<!DEBUG_INFO_CONSTANT!>value_2<!>)
}

fun case_4(value_1: String?, value_2: String?) {
    value_1.case_4_1()
    println(<!DEBUG_INFO_SMARTCAST!>value_1<!>.length)
    value_2.case_4_2()
    println(<!DEBUG_INFO_CONSTANT!>value_2<!>)
}

fun case_5(value_1: Any?) {
    if (value_1.case_5_1()) println(<!DEBUG_INFO_SMARTCAST!>value_1<!>.length)
    if (!value_1.case_5_2()) println(<!DEBUG_INFO_SMARTCAST!>value_1<!>.length)
    if (value_1.case_5_3() != null) println(<!DEBUG_INFO_SMARTCAST!>value_1<!>.length)
    if (value_1.case_5_4() == null) println(<!DEBUG_INFO_SMARTCAST!>value_1<!>.length)
}

fun case_6(value_1: Number) {
    when { value_1.case_6_1() -> println(<!DEBUG_INFO_SMARTCAST!>value_1<!>.inv()) }
    when { !value_1.case_6_2() -> println(<!DEBUG_INFO_SMARTCAST!>value_1<!>.inv()) }
    when { value_1.case_6_3() != null -> println(<!DEBUG_INFO_SMARTCAST!>value_1<!>.inv()) }
    when { value_1.case_6_4() == null -> println(<!DEBUG_INFO_SMARTCAST!>value_1<!>.inv()) }
}

fun case_7(value_1: String?) {
    if (value_1.case_7_1()) println(<!DEBUG_INFO_SMARTCAST!>value_1<!>.length)
    if (value_1.case_7_2()) println(<!DEBUG_INFO_CONSTANT!>value_1<!>)
    if (!(value_1.case_7_3() == null)) println(<!DEBUG_INFO_CONSTANT!>value_1<!>)
    if (!(value_1.case_7_4() != null)) println(<!DEBUG_INFO_CONSTANT!>value_1<!>)
    if (!value_1.case_7_5()) println(<!DEBUG_INFO_CONSTANT!>value_1<!>)
        else println(value_1)
    when (value_1.case_7_6() == null) {
        true -> println(value_1)
        false -> println(<!DEBUG_INFO_SMARTCAST!>value_1<!>.length)
    }
    if (value_1.case_7_7() != null) println(value_1)
        else println(<!DEBUG_INFO_SMARTCAST!>value_1<!>.length)
    when {
        !value_1.case_7_8() -> println(value_1)
        value_1.case_7_8() -> println(value_1)
    }
    when {
        !value_1.case_7_9() -> println(<!DEBUG_INFO_CONSTANT!>value_1<!>)
        value_1.case_7_9() -> println(value_1)
    }
    when {
        value_1.case_7_10() == null -> println(value_1)
        <!DEBUG_INFO_CONSTANT!>value_1<!>.case_7_10() != null -> println(<!DEBUG_INFO_CONSTANT!>value_1<!>)
    }
    when {
        value_1.case_7_11() != null -> println(value_1)
        <!DEBUG_INFO_CONSTANT!>value_1<!>.case_7_11() == null -> println(<!DEBUG_INFO_CONSTANT!>value_1<!>)
    }
}

fun case_8(value_1: String?, value_2: String?) {
    when { value_1.case_8_1() -> println(<!DEBUG_INFO_SMARTCAST!>value_1<!>.length) }
    when { value_2.case_8_2() -> println(<!DEBUG_INFO_CONSTANT!>value_2<!>) }
    when { !(value_2.case_8_3() == null) -> println(<!DEBUG_INFO_CONSTANT!>value_2<!>) }
    when { !(value_2.case_8_4() != null) -> println(<!DEBUG_INFO_CONSTANT!>value_2<!>) }
}

/*
 UNEXPECTED BEHAVIOUR
 KT-26382
 */
fun case_9(value_1: Number?) {
    if (value_1?.case_9_1() != null) println(<!DEBUG_INFO_SMARTCAST!>value_1<!>.toByte())
    if (value_1?.case_9_2() != null) println(<!DEBUG_INFO_SMARTCAST!>value_1<!>.toByte())
}

/*
 ISSUES: KT-26382
 */
fun case_10(value_1: Number?, value_2: Number?) {
    if (value_1?.case_10_1() == null) {
        println(value_1<!UNSAFE_CALL!>.<!>toByte())
    } else {
        println(<!DEBUG_INFO_SMARTCAST!>value_1<!>.toByte())
    }
    if (value_2?.case_10_2() != null) {
        println(<!DEBUG_INFO_SMARTCAST!>value_2<!>.toByte())
    } else {
        println(value_2<!UNSAFE_CALL!>.<!>toByte())
    }
}