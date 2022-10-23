public class Main {
    public static void main(String[] args) {
        Human Maks = new Human();
        Maks.name = "Максим";
        Maks.yearOfBirth = "24.04.1987";
        Maks.town = "Минск";
        Maks.job = "бренд-менеджер";
        Human Anna = new Human();
        Anna.name = "Аня";
        Anna.yearOfBirth = "02.07.1993";
        Anna.town = "Москва";
        Anna.job = "методист образовательных программ";
        Human Kate = new Human();
        Kate.name = "Катя";
        Kate.yearOfBirth = "14.02.1994";
        Kate.town = "Калининград";
        Kate.job = "продакт-менеджер";
        Human Artem = new Human();
        Artem.name = "Артем";
        Artem.yearOfBirth = "23.09.1995";
        Artem.town = "Москва";
        Artem.job = "директор по развитию бизнеса";
        System.out.println("Привет! Меня зовут " + Artem.name + ". Я из города " + Artem.town + ". Я родился в " + Artem.yearOfBirth + " году. Я работаю на должности - " + Artem.job + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + Kate.name + ". Я из города " + Kate.town + ". Я родилась в " + Kate.yearOfBirth + " году. Я работаю на должности - " + Kate.job + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + Anna.name + ". Я из города " + Anna.town + ". Я родилась в " + Anna.yearOfBirth + " году. Я работаю на должности - " + Anna.job + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + Maks.name + ". Я из города " + Maks.town + ". Я родился в " + Maks.yearOfBirth + " году. Я работаю на должности - " + Maks.job + ". Будем знакомы!");
    }
}