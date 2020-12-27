package org.pvv.rolfn.geo

import org.junit.Assert
import org.junit.Test


class UTMTest {
    @Test
    fun brazil() {
        Assert.assertEquals("2.0S 77.0W", WGS84(UTM(WGS84(-2.0, -77.0))).toString())
    }

    @Test
    fun norway() {
        Assert.assertEquals("60.0N 11.0E", WGS84(UTM(WGS84(60.0, 11.0))).toString())
    }
}