public class Person {
    private String personName;
    private String personSurname;
    private String personPatronymic;
    private String personPosition;
    private String email;
    private int phoneNumber;
    private int personWage;
    private int personAge;

    public Person(String name, String surname, String patronymic, String position, String email, int number, int wage, int age) {
        this.personName = name;
        this.personSurname = surname;
        this.personPatronymic = patronymic;
        this.personPosition = position;
        this.email =email;
        this.phoneNumber = number;
        this.personWage = wage;
        this.personAge = age;
    }
    public void info(){
        if(personAge > 40){
            System.out.printf("Name: %s %s %s; Position: %s; Email: %s; Phone numper: %d; Wage: %d; Age: %d\n", personSurname, personName, personPatronymic, personPosition, email, phoneNumber, personWage, personAge);

        }
    }

}
