package com.example.navcompexample

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.math.BigDecimal

@Parcelize
/* The error below is okay as it is.
Idk why but it doesnot interfere with the functionality and the app will
run as intended
 */
data class Money(val amount:BigDecimal): Parcelable {

}