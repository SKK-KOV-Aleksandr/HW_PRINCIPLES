package ru.netology;

public class Post {
    public FormDate birthday;
    public String name;
    public String passport;
    public String patronymic;
    public String phone;
    public String surname;
    public boolean subscription;


    @Override
    public String toString() {
        return "Post{\n" +
                "birthday=" + birthday +
                ", \nname='" + name + '\'' +
                ", \npassport='" + passport + '\'' +
                ", \npatronymic='" + patronymic + '\'' +
                ", \nphone='" + phone + '\'' +
                ", \nsurname='" + surname + '\'' +
                ", \nsubscription=" + subscription +
                '}';
    }
}
