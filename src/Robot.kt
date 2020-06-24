import java.util.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
// class Robot
class Robot(var name : String , var time : Int ) {

    // funtion greet , koko will greet everytime !
    fun greet() {
        println("Hello sir, i am $name")
    }

    // funtion alarm , koko will wake up you on non-holidays at 8AM
    fun alarm(day: Int) {
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")
        val formatted = current.format(formatter)
        if (day == 1) {
            println("Its Holiday Today do you have any plan to wakeup ! its already $formatted")
        } else if (day == 2) {
            println("wake up ! it's Monday you have to get ready for school it's already $time AM")
        } else if (day == 3) {
            println("wake up ! it's Tuesday you have to get ready for school it's already $time AM")
        } else if (day == 4) {
            println("wake up ! it's Wednesday you have to get ready for school it's already $time AM")
        } else if (day == 5) {
            println("wake up ! it's Thusday you have to get ready for school it's already $time AM")
        } else if (day == 6) {
            println("wake up ! it's Friday you have to get ready for school it's already $time AM")
        } else if (day == 7) {
            println("Its Holiday Today do you have any plan to wakeup ! its already $formatted")
        }

    }

    //funtion coffee, koko will make coffee for your according to your choice !
    fun coffee() {
        println("I am making coffee for you , how would you prefer black or milky ?")
        val read = Scanner(System.`in`)
        //Taking integer input
        val choice = read.nextLine()
        println("What would you prefer 1 or 2 Spoons of Sugar?")
        val sugar = read.nextLine()
        println("Your $choice coffee with $sugar Spoons of sugar is ready !")
    }

    //funtion heat_the_water , koko will heat the water for you according to your preered temperature
    fun heatTheWater(day: Int) {
        if (day == 1) {
            println("Its Sunday,You don't bath on Sunday ! I think you are ready to spend your sunday lazily lying on bed.")
        } else if (day == 2) {
            println("You have to bath today !What temperature of water would you prefer ? ")
            val read = Scanner(System.`in`)
            val temp = read.nextInt()
            println("Yor water is heating at $temp degree celcius !")
        } else if (day == 3) {
            println("You have to bath today !What temperature of water would you prefer ? ")
            val read = Scanner(System.`in`)
            val temp = read.nextInt()
            println("Yor water is heating at $temp degree celcius")
        } else if (day == 4) {
            println("You have to bath today !What temperature of water would you prefer ? ")
            val read = Scanner(System.`in`)
            val temp = read.nextInt()
            println("Yor water is heating at $temp degree celcius")
        } else if (day == 5) {
            println("You have to bath today !What temperature of water would you prefer ? ")
            val read = Scanner(System.`in`)
            val temp = read.nextInt()
            println("Yor water is heating at $temp degree celcius")
        } else if (day == 6) {
            println("You have to bath today !What temperature of water would you prefer ? ")
            val read = Scanner(System.`in`)
            val temp = read.nextInt()
            println("Yor water is heating at $temp degree celcius")
        } else if (day == 7) {
            println("You have to bath today ! What temperature of water would you prefer ? ")
            val read = Scanner(System.`in`)
            val temp = read.nextInt()
            println("Yor water is heating at $temp degree celcius")
        }
    }
    fun iron(){
        println("What you want to wear today ? I will iron it till you take bath ! Thanks me later :)")
        val read = Scanner(System.`in`)
        val cloth_choice = read.nextLine()
        println("Your $cloth_choice are ironed !")
    }

    //funtion packbag, koko will pack your bag according to your daily timetable
    fun packBag(day: Int) {
        val messageTemplate = "Books kept into your bag for today according to your timetable : "
        val subjects =
                arrayOf("DAA", "OOPJ", "DS", "MATH", "P&S", "BHR", "OS")


        when (day) {
            Calendar.MONDAY -> println("$messageTemplate ${subjects[0]}, ${subjects[1]}, ${subjects[2]}")
            Calendar.TUESDAY -> println("$messageTemplate ${subjects[0]}, ${subjects[1]}, ${subjects[2]}")
            Calendar.WEDNESDAY -> println("$messageTemplate ${subjects[3]}, ${subjects[4]}")
            Calendar.THURSDAY -> println("$messageTemplate ${subjects[3]}, ${subjects[4]}")
            Calendar.FRIDAY -> println("$messageTemplate ${subjects[5]}, ${subjects[6]}")
            else -> println("Invalid day or maybe its holiday today!!")
        }
    }


    /*funtion cook, The Robot will cook your food according to your taste.
       You can let the Robot know which food items do you like for breakfast
       and lunch and it will choose randomly from the list provided by you.
       To randomly choose an option from a list i have used the ​.random() method on the list.*/
    fun cook() {
        val list_of_breakfast = mutableListOf<String>("Poha", "upma", "idli", "dosa", "maggie", "oats", "bread&butter")
        val list_of_lunch = mutableListOf<String>("Masala Bhindi", "Chana Kulcha", "Shahi Egg Curry", "Gujarati Kadhi", "Allahabad Ki Tehri", "Low Fat Dahi Chicken", "Kolhapuri Vegetables", "Black Channa and Coconut Stew")
        println("Your breakfast is ready ! Enjoy your ${list_of_breakfast.random()} ")
        println("Today's menu for lunch will be ${list_of_lunch.random()} , I am Sure you will like it !")
    }
}
 // main funtion
    fun main() {
        val robo = Robot(name = "koko", time = 8) // creating the object for class Robot
        robo.greet()
        robo.alarm(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
        robo.coffee()
        robo.heatTheWater(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
        robo.iron()
        robo.packBag(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
        robo.cook()
    }




