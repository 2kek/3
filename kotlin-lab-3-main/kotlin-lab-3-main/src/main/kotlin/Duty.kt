class Duty (position: String, experience: Int, solary: Int, duty: String) { //геттеры открытые

    //сеттеры закрытые
    var position: String = position
        private set
    private var experience: Int = experience
        private set
    private var solary: Int = solary
        private set
    private var duty: String = duty
        private set

    override fun toString(): String {
        return "position='$position', experience=$experience, solary=$solary, duty='$duty')"
    }
}
