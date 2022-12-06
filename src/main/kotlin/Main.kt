fun main() {
    println("How old are you?")
    val userAge = readLine()
    if (userAge != null)
        if (userAge.toInt() in 1..18)
            println("You are not an adult")
        else if (userAge.toInt() in 18..60)
            println("You're an adult")
        else if (userAge.toInt() > 60)
            println("How yo grankids doin")

        else if(userAge.toInt() < 0)
            println("Insert a valid number you lil bitch")


}