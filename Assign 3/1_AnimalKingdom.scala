abstract class Animals{
	val respiration:String = "Aerobic"
	val organismType:String = "Eukaryotic"
	val multicellular:Boolean = true
	}

class Mammals(val `type`:String) extends Animals{
	val chambersInHeart:Int = 4
	val posessMammaryGland:Boolean = true
	override def toString = s"Respiration: $respiration, Organism Type: $organismType, Multicellular: $multicellular, Mammal type: ${`type`}, Chambers in Heart = $chambersInHeart, Posess Mammary glands = $posessMammaryGland"
}

class Birds extends Animals{
	val feathers:Boolean = true
	val oviparous:Boolean = true
	override def toString = s"Respiration: $respiration, Organism Type: $organismType, Multicellular: $multicellular, Feathers = $feathers, Oviparous = $oviparous"
}

class Reptiles(val movementType:String) extends Animals{
	val bloodType:String = "Cold Blooded"
	val scalesOrScutes:Boolean = true
	override def toString = s"Respiration: $respiration, Organism Type: $organismType, Multicellular: $multicellular, Movement type: $movementType, Blood Type = $bloodType, Scales or Scute = $scalesOrScutes"
}

val Horse = new Mammals("placental")
val Kangaroo = new Mammals("marsupial")
val parrot = new Birds()
val Lizard = new Reptiles("Four legged")
val Snake = new Reptiles("Undulate the body")