

fun findScreenHeight(width: Int, ratio: String): String {

    var r = ratio.split(":")

    return "${width}x${(width / r[0].toInt()) * r[1].toInt()}";
}

fun main() {

    println(
        findScreenHeight(1024,"4:3")
    )

}