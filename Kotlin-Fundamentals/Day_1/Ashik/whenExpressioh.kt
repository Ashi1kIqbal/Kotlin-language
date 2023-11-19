fun main(){
    var season = 5
    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autmn")
        }
        4 -> println("Winter")
        else -> println("invalid Season")

    }

    var month = 0

    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("fall")
        12, 1, 2 -> println("Winter")
        else -> println("Invalid Season")
    }
    var age = 21
    when(age){
        20 -> println("Twenty")
        21 -> println("Twenty One")
        18 -> println("Eighteen")
        else -> println("Invalid Age")
    }

    var x : Any = "13.37f"

    when(x){
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not a Double")
        is String -> println("$x is a String")
        else -> println("$x is none of Above")
    }

}