@JvmInline
value class Fio (val fio: String) //inline class, может принимать 1 параметр

class Person (val fio: Fio, val age: Int, val sex: String){
    var passport: Passport? = null
    var duties: MutableList<Duty>? = mutableListOf() //по умолчанию лист пустой


    constructor(fio: Fio, age: Int,sex: String, passport: Passport): this(fio,age, sex){
        this.passport = passport
    }

    constructor(fio: Fio, age: Int, sex: String, passport: Passport, duties: MutableList<Duty>): this(fio,age, sex, passport){
        this.duties = duties
    }

    //добавление обязанностей
    fun addDuty(duty: Duty){
        duties?.add(duty)
    }

    //удаление обязанностей
    fun deleteDuty(position: String) {
        println("Ваша должность: $position , теперь Вы сняты с должности")
        duties?.removeAll { it.position == position }
    }

    init {
        if (age < 18){
            duties = null
        }
    }

    override fun toString(): String {
        return "Person $fio, age=$age, sex='$sex', passport $passport ,\n duties=$duties"
    }

}
