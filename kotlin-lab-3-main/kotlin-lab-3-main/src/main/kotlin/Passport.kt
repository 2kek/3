class Passport(var series: String, var number: String) {

    init {
        require(series.matches("\\d{4}".toRegex())) {
            "Серия паспорта должна содержать только 4 цифры"
        }
        require(number.matches("\\d{6}".toRegex())) {
            "Номер паспорта должен содержать только 6 цифр"
        }
    }

    override fun toString(): String {
        return "series=$series, number=$number"
    }
}

