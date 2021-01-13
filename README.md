# geoConverter - Kotlin version

Forked from [@rolfrander](https://github.com/rolfrander/geo)

Code for representing and converting between geographical coordinate systems, taken from
[Stack overflow](https://stackoverflow.com/questions/176137/java-convert-lat-lon-to-utm).

There are two classes, for [UTM-coordinates](https://en.wikipedia.org/wiki/Universal_Transverse_Mercator_coordinate_system)
and [WGS84-coordinates](https://en.wikipedia.org/wiki/World_Geodetic_System).
Example usage:

```
//  zone, letter, x coordinate, y coordinate
val utm_to_wgs = WGS84( UTM(31, 'V', 375273.85, 6207884.59) )

// latitude, longitude
val wgs_to_utm = UTM( WGS84(56,-5) )

```

# BUGS
There is no error-handling...
