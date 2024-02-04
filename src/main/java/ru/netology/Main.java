package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = 26;
        post.birthday.month = 6;
        post.birthday.year = 1799;
        post.name = "Петр";
        post.passport = "1234 # 567890";
        post.patronymic = "Иванович";
        post.phone = "8(800)-555-35-35";
        post.surname = "Нестеров";
        post.subscription = true;
        System.out.println(post);
    }
}