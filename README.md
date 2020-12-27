# geo Korlin version

Forked from [@rolfrander](https://github.com/rolfrander/geo)

Code for representing and converting between geographical coordinate systems, taken from
[Stack overflow](https://stackoverflow.com/questions/176137/java-convert-lat-lon-to-utm).

The code has been cleaned up a bit to make it more "object oriented" and according to common java
idioms and coding standards.

There are two classes, for [UTM-coordinates](https://en.wikipedia.org/wiki/Universal_Transverse_Mercator_coordinate_system)
and [WGS84-coordinates](https://en.wikipedia.org/wiki/World_Geodetic_System).
Example usage:

```
val utm_a = UTM(31, 'V', 375273.85, 6207884.59)
val wgs_a = WGS84(utm_a)

val wgs_b = WGS84(56,-5)
val utm_b = UTM(wgs_a)
```

# BUGS
There is no error-handling...
