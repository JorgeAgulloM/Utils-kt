package com.softyorch.utilsktlibrary

import android.os.Build
import androidx.annotation.ChecksSdkIntAtLeast

object SdkUtils {

    var testingSdkInt: Int? = null
    val sdkInt: Int
        get() = testingSdkInt ?: Build.VERSION.SDK_INT

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is >= 36 (BAKLAVA).
     *
     * @return T or null
     * */
    @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.BAKLAVA, lambda = 0)
    inline fun <T> sdk36AndUp(onSdk36: () -> T): T? =
        if (sdkInt >= Build.VERSION_CODES.BAKLAVA) onSdk36() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is >= 35 (VANILLA_ICE_CREAM).
     *
     * @return T or null
     * */
    @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.VANILLA_ICE_CREAM, lambda = 0)
    inline fun <T> sdk35AndUp(onSdk35: () -> T): T? =
        if (sdkInt >= Build.VERSION_CODES.VANILLA_ICE_CREAM) onSdk35() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is >= 34 (UPSIDE_DOWN_CAKE).
     *
     * @return T or null
     * */
    @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.UPSIDE_DOWN_CAKE, lambda = 0)
    inline fun <T> sdk34AndUp(onSdk34: () -> T): T? =
        if (sdkInt >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE) onSdk34() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is >= 33 (TIRAMISU).
     *
     * @return T or null
     * */
    @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.TIRAMISU, lambda = 0)
    inline fun <T> sdk33AndUp(onSdk33: () -> T): T? =
        if (sdkInt >= Build.VERSION_CODES.TIRAMISU) onSdk33() else null


    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is >= 32 (S_V2).
     *
     * @return T or null
     * */
    @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.S_V2, lambda = 0)
    inline fun <T> sdk32AndUp(onSdk32: () -> T): T? =
        if (sdkInt >= Build.VERSION_CODES.S_V2) onSdk32() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is >= 31 (S).
     *
     * @return T or null
     * */
    @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.S, lambda = 0)
    inline fun <T> sdk31AndUp(onSdk31: () -> T): T? =
        if (sdkInt >= Build.VERSION_CODES.S) onSdk31() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is >= 30 (R).
     *
     * @return T or null
     * */
    @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.R, lambda = 0)
    inline fun <T> sdk30AndUp(onSdk30: () -> T): T? =
        if (sdkInt >= Build.VERSION_CODES.R) onSdk30() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is >= 29 (Q).
     *
     * @return T or null
     * */
    @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.Q, lambda = 0)
    inline fun <T> sdk29AndUp(onSdk29: () -> T): T? =
        if (sdkInt >= Build.VERSION_CODES.Q) onSdk29() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is >= 28 (P).
     *
     * @return T or null
     * */
    @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.P, lambda = 0)
    inline fun <T> sdk28AndUp(onSdk28: () -> T): T? =
        if (sdkInt >= Build.VERSION_CODES.P) onSdk28() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is >= 27 (O_MR1).
     *
     * @return T or null
     * */
    @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.O_MR1, lambda = 0)
    inline fun <T> sdk27AndUp(onSdk27: () -> T): T? =
        if (sdkInt >= Build.VERSION_CODES.O_MR1) onSdk27() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is >= 26 (O).
     *
     * @return T or null
     * */
    @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.O, lambda = 0)
    inline fun <T> sdk26AndUp(onSdk26: () -> T): T? =
        if (sdkInt >= Build.VERSION_CODES.O) onSdk26() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is >= 25 (N_MR1).
     *
     * @return T or null
     * */
    @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.N_MR1, lambda = 0)
    inline fun <T> sdk25AndUp(onSdk25: () -> T): T? =
        if (sdkInt >= Build.VERSION_CODES.N_MR1) onSdk25() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is >= 24 (N).
     *
     * @return T or null
     * */
    @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.N, lambda = 0)
    inline fun <T> sdk24AndUp(onSdk24: () -> T): T? =
        if (sdkInt >= Build.VERSION_CODES.N) onSdk24() else null


    //Down of

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is < 36 (BAKLAVA).
     *
     * @return T or null
     * */
    inline fun <T> sdk36Down(onSdk36: () -> T): T? =
        if (sdkInt < Build.VERSION_CODES.BAKLAVA) onSdk36() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is < 35 (VANILLA_ICE_CREAM).
     *
     * @return T or null
     * */
    inline fun <T> sdk35Down(onSdk35: () -> T): T? =
        if (sdkInt < Build.VERSION_CODES.VANILLA_ICE_CREAM) onSdk35() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is < 34 (UPSIDE_DOWN_CAKE).
     *
     * @return T or null
     * */
    inline fun <T> sdk34Down(onSdk34: () -> T): T? =
        if (sdkInt < Build.VERSION_CODES.UPSIDE_DOWN_CAKE) onSdk34() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is < 33 (TIRAMISU).
     *
     * @return T or null
     * */
    inline fun <T> sdk33Down(onSdk33: () -> T): T? =
        if (sdkInt < Build.VERSION_CODES.TIRAMISU) onSdk33() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is < 32 (S_V2).
     *
     * @return T or null
     * */
    inline fun <T> sdk32Down(onSdk32: () -> T): T? =
        if (sdkInt < Build.VERSION_CODES.S_V2) onSdk32() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is < 31 (S).
     *
     * @return T or null
     * */
    inline fun <T> sdk31Down(onSdk31: () -> T): T? =
        if (sdkInt < Build.VERSION_CODES.S) onSdk31() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is < 30 (R).
     *
     * @return T or null
     * */
    inline fun <T> sdk30Down(onSdk30: () -> T): T? =
        if (sdkInt < Build.VERSION_CODES.R) onSdk30() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is < 29 (Q).
     *
     * @return T or null
     * */
    inline fun <T> sdk29Down(onSdk29: () -> T): T? =
        if (sdkInt < Build.VERSION_CODES.Q) onSdk29() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is < 28 (P).
     *
     * @return T or null
     * */
    inline fun <T> sdk28Down(onSdk28: () -> T): T? =
        if (sdkInt < Build.VERSION_CODES.P) onSdk28() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is < 27 (O_MR1).
     *
     * @return T or null
     * */
    inline fun <T> sdk27Down(onSdk27: () -> T): T? =
        if (sdkInt < Build.VERSION_CODES.O_MR1) onSdk27() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is < 26 (O).
     *
     * @return T or null
     * */
    inline fun <T> sdk26Down(onSdk26: () -> T): T? =
        if (sdkInt < Build.VERSION_CODES.O) onSdk26() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is < 25 (N_MR1).
     *
     * @return T or null
     * */
    inline fun <T> sdk25Down(onSdk25: () -> T): T? =
        if (sdkInt < Build.VERSION_CODES.N_MR1) onSdk25() else null

    /**
     * Allows the implemented code to be executed if the value of sdk is met.
     *
     * Checks if SDK version is < 24 (N).
     *
     * @return T or null
     * */
    inline fun <T> sdk24Down(onSdk24: () -> T): T? =
        if (sdkInt < Build.VERSION_CODES.N) onSdk24() else null

    //Variables

    /**
     * Facilitates the review of the condition SDK >= 36 (BAKLAVA).
     * @Return boolean value
     * */
    val sdk36AndUp @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.BAKLAVA)
    get() = sdkInt >= Build.VERSION_CODES.BAKLAVA

    /**
     * Facilitates the review of the condition SDK >= 35 (VANILLA_ICE_CREAM).
     * @Return boolean value
     * */
    val sdk35AndUp @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.VANILLA_ICE_CREAM)
    get() = sdkInt >= Build.VERSION_CODES.VANILLA_ICE_CREAM

    /**
     * Facilitates the review of the condition SDK >= 34 (UPSIDE_DOWN_CAKE).
     * @Return boolean value
     * */
    val sdk34AndUp @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.UPSIDE_DOWN_CAKE)
    get() = sdkInt >= Build.VERSION_CODES.UPSIDE_DOWN_CAKE

    /**
     * Facilitates the review of the condition SDK >= 33 (TIRAMISU).
     * @Return boolean value
     * */
    val sdk33AndUp @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.TIRAMISU)
    get() = sdkInt >= Build.VERSION_CODES.TIRAMISU

    /**
     * Facilitates the review of the condition SDK >= 32 (S_V2).
     * @Return boolean value
     * */
    val sdk32AndUp @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.S_V2)
    get() = sdkInt >= Build.VERSION_CODES.S_V2

    /**
     * Facilitates the review of the condition SDK >= 31 (S).
     * @Return boolean value
     * */
    val sdk31AndUp @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.S)
    get() = sdkInt >= Build.VERSION_CODES.S

    /**
     * Facilitates the review of the condition SDK >= 30 (R).
     * @Return boolean value
     * */
    val sdk30AndUp @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.R)
    get() = sdkInt >= Build.VERSION_CODES.R

    /**
     * Facilitates the review of the condition SDK >= 29 (Q).
     * @Return boolean value
     * */
    val sdk29AndUp @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.Q)
    get() = sdkInt >= Build.VERSION_CODES.Q

    /**
     * Facilitates the review of the condition SDK >= 28 (P).
     * @Return boolean value
     * */
    val sdk28AndUp @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.P)
    get() = sdkInt >= Build.VERSION_CODES.P

    /**
     * Facilitates the review of the condition SDK >= 27 (O_MR1).
     * @Return boolean value
     * */
    val sdk27AndUp @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.O_MR1)
    get() = sdkInt >= Build.VERSION_CODES.O_MR1

    /**
     * Facilitates the review of the condition SDK >= 26 (O).
     * @Return boolean value
     * */
    val sdk26AndUp @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.O)
    get() = sdkInt >= Build.VERSION_CODES.O

    /**
     * Facilitates the review of the condition SDK >= 25 (N_MR1).
     * @Return boolean value
     * */
    val sdk25AndUp @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.N_MR1)
    get() = sdkInt >= Build.VERSION_CODES.N_MR1

    /**
     * Facilitates the review of the condition SDK >= 24 (N).
     * @Return boolean value
     * */
    val sdk24AndUp @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.N)
    get() = sdkInt >= Build.VERSION_CODES.N

}
