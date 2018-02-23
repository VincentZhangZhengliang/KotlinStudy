package 枚举类

/**
 *  Package:枚举类
 *  User:Vincent
 *  Date:2017/11/22 15:21
 *  Dsc:
 */
enum class Direction {
    NORTH, SOUTH, WEST, EAST
}


enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

fun main(args: Array<String>) {

    val north = Direction.NORTH
    println(north)

    val color = Color.RED
    println(color.rgb)

    println(Direction.NORTH.name)
    println(Direction.NORTH.ordinal)

}