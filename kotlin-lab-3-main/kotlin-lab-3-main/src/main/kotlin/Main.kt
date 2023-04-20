import java.util.*

fun main() {
    val Mark = Person(Fio("Ilya Tupoi"), 14, "men", Passport("6044", "333108"))
    val Jon = Person(Fio("Sasha Pipka"), 19, "men", Passport("6019", "759227"))
    val Alex = Person(
        Fio("Vova"), 24, "men", Passport("6021", "423322"),
        mutableListOf(Duty("guy", 3, 30000, "Менеджер"))
    )

    println(Jon)

    val scanner = Scanner(System.`in`)

    println("Нажмите 1, чтобы добавить обязанность")
    val x = scanner.nextInt()

    if (x == 1) {
        Jon.addDuty(Duty("Дворник", 3, 50000, "Мыть да мести"))
        println("Добавили обязанность: $Jon")
    }

    println("Нажмите 2, чтобы удалить обязанность")
    val y = scanner.nextInt()
    if (y == 2) {
        Jon.deleteDuty("Хозяин кота Гарфилда")
        println("Удалили обязанность: $Jon")
    }

    println("Остальные работники:\n$Mark\n$Alex")

    println("Хотите добавить нового работника?\n1 - да, 2 - нет")
    val z = scanner.nextInt()

    if (z == 1) {
        println("Добавление нового работника:")

        println("Введите ФИО")
        val FIO = Fio(scanner.nextLine())

        println("Введите возраст")
        val AGE = scanner.nextInt()

        println("Введите пол")
        val SEX = scanner.nextLine()

        println("Введите серию паспорта (не более 4 цифр)")
        val SERIES = scanner.nextLine()

        println("Введите номер паспорта (не более 6 цифр)")
        val NUMBER = scanner.nextLine()

        val person = Person(FIO, AGE, SEX, Passport(SERIES, NUMBER))
        println("Создан новый работник:\n$person")
    }

    scanner.close()
}