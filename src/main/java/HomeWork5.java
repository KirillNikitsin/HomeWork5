public class HomeWork5 {
    public static void main(String[] args) {
        Person pers1 = new Person("Иван", "Иванов", "Иванович", "Инженер", "Ivanov@mail.com", 3214651, 31000, 42);
        Person pers2 = new Person("Иван", "Петров", "Алексеевич", "Охранник", "Petrov@mail.com", 3214652, 26000, 29);
        Person pers3 = new Person("Алексей", "Смирнов", "Петрович", "Заместитель директора", "Smirnov@mail.com", 3214653, 44000, 47);
        Person pers4 = new Person("Михаил", "Жук", "Владимирович", "Директор", "Jyk@mail.com", 3214654, 51000, 26);
        Person pers5 = new Person("Андрей", "Лось", "Александрович", "Уборщик", "Neznay@mail.com", 3214655, 21000, 32);
        Person[] pers = {pers1, pers2, pers3, pers4, pers5};
        for (Person i : pers) {
            i.info();
        }
    }

}

