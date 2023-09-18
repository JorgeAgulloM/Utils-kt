package com.softyorch.utilsktlibrary

import android.os.Build

object SdkUtils {

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is >= 33 (TIRAMISU).
     *
     * @return T or null
     * */
    inline fun <T> sdk33AndUp(onSdk33: () -> T): T? =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) onSdk33() else null


    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is >= 32 (S_V2).
     *
     * @return T or null
     * */
    inline fun <T> sdk32AndUp(onSdk32: () -> T): T? =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S_V2) onSdk32() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is >= 31 (S).
     *
     * @return T or null
     * */
    inline fun <T> sdk31AndUp(onSdk31: () -> T): T? =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) onSdk31() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is >= 30 (R).
     *
     * @return T or null
     * */
    inline fun <T> sdk30AndUp(onSdk30: () -> T): T? =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) onSdk30() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is >= 29 (Q).
     *
     * @return T or null
     * */
    inline fun <T> sdk29AndUp(onSdk29: () -> T): T? =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) onSdk29() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is >= 28 (P).
     *
     * @return T or null
     * */
    inline fun <T> sdk28AndUp(onSdk28: () -> T): T? =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) onSdk28() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is >= 27 (O_MR1).
     *
     * @return T or null
     * */
    inline fun <T> sdk27AndUp(onSdk27: () -> T): T? =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O_MR1) onSdk27() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is >= 26 (O).
     *
     * @return T or null
     * */
    inline fun <T> sdk26AndUp(onSdk26: () -> T): T? =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) onSdk26() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is >= 25 (N_MR1).
     *
     * @return T or null
     * */
    inline fun <T> sdk25AndUp(onSdk25: () -> T): T? =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N_MR1) onSdk25() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is >= 24 (N).
     *
     * @return T or null
     * */
    inline fun <T> sdk24AndUp(onSdk24: () -> T): T? =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) onSdk24() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is >= 23 (M).
     *
     * @return T or null
     * */
    inline fun <T> sdk23AndUp(onSdk23: () -> T): T? =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) onSdk23() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is >= 22 (LOLLIPOP_MR1).
     *
     * @return T or null
     * */
    inline fun <T> sdk22AndUp(onSdk22: () -> T): T? =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1) onSdk22() else null

    //Down of

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is < 33 (TIRAMISU).
     *
     * @return T or null
     * */
    inline fun <T> sdk33Down(onSdk32: () -> T): T? =
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU) onSdk32() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is < 32 (S_V2).
     *
     * @return T or null
     * */
    inline fun <T> sdk32Down(onSdk31: () -> T): T? =
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.S_V2) onSdk31() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is < 31 (S).
     *
     * @return T or null
     * */
    inline fun <T> sdk31Down(onSdk31: () -> T): T? =
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.S) onSdk31() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is < 30 (R).
     *
     * @return T or null
     * */
    inline fun <T> sdk30Down(onSdk30: () -> T): T? =
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.R) onSdk30() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is < 29 (Q).
     *
     * @return T or null
     * */
    inline fun <T> sdk29Down(onSdk29: () -> T): T? =
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) onSdk29() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is < 28 (P).
     *
     * @return T or null
     * */
    inline fun <T> sdk28Down(onSdk28: () -> T): T? =
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.P) onSdk28() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is < 27 (O_MR1).
     *
     * @return T or null
     * */
    inline fun <T> sdk27Down(onSdk27: () -> T): T? =
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O_MR1) onSdk27() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is < 26 (O).
     *
     * @return T or null
     * */
    inline fun <T> sdk26Down(onSdk26: () -> T): T? =
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) onSdk26() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is < 25 (N_MR1).
     *
     * @return T or null
     * */
    inline fun <T> sdk25Down(onSdk25: () -> T): T? =
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N_MR1) onSdk25() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is < 24 (N).
     *
     * @return T or null
     * */
    inline fun <T> sdk24Down(onSdk24: () -> T): T? =
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.N) onSdk24() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is < 23 (M).
     *
     * @return T or null
     * */
    inline fun <T> sdk23Down(onSdk23: () -> T): T? =
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) onSdk23() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is < 22 (LOLLIPOP_MR1).
     *
     * @return T or null
     * */
    inline fun <T> sdk22Down(onSdk22: () -> T): T? =
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP_MR1) onSdk22() else null

    //Variables

    /**
     * Facilitates the review of the condition SDK >= 33 (TIRAMISU).
     * @Return boolean value
     * */
    val sdk33AndUp = Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU

    /**
     * Facilitates the review of the condition SDK >= 32 (S_V2).
     * @Return boolean value
     * */
    val sdk32AndUp = Build.VERSION.SDK_INT >= Build.VERSION_CODES.S_V2

    /**
     * Facilitates the review of the condition SDK >= 31 (S).
     * @Return boolean value
     * */
    val sdk31AndUp = Build.VERSION.SDK_INT >= Build.VERSION_CODES.S

    /**
     * Facilitates the review of the condition SDK >= 30 (R).
     * @Return boolean value
     * */
    val sdk30AndUp = Build.VERSION.SDK_INT >= Build.VERSION_CODES.R

    /**
     * Facilitates the review of the condition SDK >= 29 (Q).
     * @Return boolean value
     * */
    val sdk29AndUp = Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q

    /**
     * Facilitates the review of the condition SDK >= 28 (P).
     * @Return boolean value
     * */
    val sdk28AndUp = Build.VERSION.SDK_INT >= Build.VERSION_CODES.P

    /**
     * Facilitates the review of the condition SDK >= 27 (O_MR1).
     * @Return boolean value
     * */
    val sdk27AndUp = Build.VERSION.SDK_INT >= Build.VERSION_CODES.O_MR1

    /**
     * Facilitates the review of the condition SDK >= 26 (O).
     * @Return boolean value
     * */
    val sdk26AndUp = Build.VERSION.SDK_INT >= Build.VERSION_CODES.O

    /**
     * Facilitates the review of the condition SDK >= 25 (N_MR1).
     * @Return boolean value
     * */
    val sdk25AndUp = Build.VERSION.SDK_INT >= Build.VERSION_CODES.N_MR1

    /**
     * Facilitates the review of the condition SDK >= 24 (N).
     * @Return boolean value
     * */
    val sdk24AndUp = Build.VERSION.SDK_INT >= Build.VERSION_CODES.N

    /**
     * Facilitates the review of the condition SDK >= 23 (M).
     * @Return boolean value
     * */
    val sdk23AndUp = Build.VERSION.SDK_INT >= Build.VERSION_CODES.M

    /**
     * Facilitates the review of the condition SDK >= 22 (LOLLIPOP_MR1).
     * @Return boolean value
     * */
    val sdk22AndUp = Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1
}