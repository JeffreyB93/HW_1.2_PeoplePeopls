fun main() {
    val likes: Int = 2
    val likesStr = likes.toString()


    if (likesStr[likesStr.length - 1] == '1' && likes != 11) {
        println("Понравилось " + likes + " человеку")
    }
    else {
        println("Понравилось " + likes + " людям")
    }
}