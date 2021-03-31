import kotlin.math.max

fun main() {
var car=Car("Subar","Legacy","white",70)
 car.carry(65)
  car.identity()
 println(car.calculateParkingFees(2))


    var bus=Bus("Rava4","legacy","White",40)
    bus.identity()
    println(bus.calculateParkingFees(2))
    println(bus.maxTripeFare(212.2))
}
 open class Road( var make:String,var model:String,var color :String ,var capacity:Int ){
    fun carry(people:Int){
        var x = people - capacity
        if (people <= capacity) {
            println("carrying $people passenger")
        }
        else {
            println("over capacity by $x people")
        }
    }

    fun identity(){
        println("I am $color $make  $model")
    }
   open fun calculateParkingFees(hour:Int):Int{
      return hour*20



    }
}
class Car(make: String,model: String,color: String,capacity: Int):Road(make,model,color,capacity){}


class Bus(make: String,model: String,color: String,capacity: Int):Road(make,model,color,capacity) {
    override fun calculateParkingFees(hour: Int): Int {
        return hour * capacity
    }

    fun maxTripeFare(fare: Double): Double {
        var max = 0
        return max + fare
    }
}