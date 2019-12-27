public class Person {
    private String surname = "-";
    private String name = "-";
    private String patronymic = "-";

    Person(){}

    Person(String surname)
    {
        this.surname = surname;
    }

    Person(String surname, String name, String patronymic)
    {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }


    public String getInitials()
    {
        return surname + " " + name.substring(0,1) + "." + patronymic.substring(0,1) + ".";
    }
}
