public class Main {

    // Домашнее задание 1

    // Задание 1
    public static void Task1() {

        int age = 20;
        if (age >= 18) {
            System.out.println("Поздравляем пользователя с совершеннолетием.");
        }
        if (age <= 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }
        System.out.println();
    }

    // задание 2
    public static void Task2() {

        int age = 25;

        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age > 18 && age < 24) {
            System.out.println("Человек закончил школу и может отправляться в университет");
        }

        if (age > 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        System.out.println();
    }

    // задание 3
    public static void Task3() {

        int allSeats = 102;
        int seating = 60;
        int people = 103;
        if (people >= allSeats) {
            System.out.println("Вагон уже полностью забит");
        }
        if (people > seating && people < allSeats) {
            System.out.println("В вогоне только стоячие места");
        }
        if (people < seating) {
            System.out.println("В вогоне есть сидячие места");
        }
        System.out.println();
    }

    // Домашнее задание 2

    // Задание 1
    public static void Task4() {

        int age = 15;
        if (age >= 18) {
            System.out.println("Поздравляем пользователя с совершеннолетием.");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }
        System.out.println();
    }


    // Задание 2
    public static void Task5() {

        int age = 7;

        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        } else if (age > 18 && age < 24) {
            System.out.println("Человек закончил школу и может отправляться в университет");
        } else {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        System.out.println();
    }

    // Задание 3
    public static void Task6() {

        int allSeats = 102;
        int seating = 60;
        int people = 55;
        if (people < seating) {
            System.out.println("В вогоне есть сидячие места");
        } else if (people > seating && people < allSeats) {
            System.out.println("В вогоне только стоячие места");
        } else {
            System.out.println("Вагон уже полностью забит");
        }
        System.out.println();
    }


    // Домашнее задание 3

    //Задание 1
    public static void Task7() {

        int age = 24;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детский сад.");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу.");
        }
        if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " , то его место в университете.");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему пора ходить на работу.");
        }
        System.out.println();
    }

    //Задание 2
    public static void Task8() {

        int age = 15;

        if (age < 5) {
            System.out.println("Ребенку нельзя кататься на атракчионе.");
        } else if (age >= 5 && age <= 14) {
            System.out.println("Ребенок может кататься на атракционе только в сопровождении взрослого.");
        } else {
            System.out.println("Ребенок может кататься без сопровождения взрослого.");
        }
        System.out.println();
    }

    //Задание 3
    public static void Task9() {

        int one = 56;
        int two = 69;
        int free = 105;

        if (one > two && one > free) {
            System.out.println("из трех чесел " + one + ", " + two + ", " + free + " самое большое = " + one);
        } else if (two > one && two > free) {
            System.out.println("из трех чесел " + one + ", " + two + ", " + free + " самое большое = " + two);
        } else {
            System.out.println("из трех чесел " + one + ", " + two + ", " + free + " самое большое = " +free);
        }
        System.out.println();
    }
    public static void main(String[] args) {

        // Домашнее задание 1
        Task1();
        Task2();
        Task3();

        // Домашнее задание 2
        Task4();
        Task5();
        Task6();

        // Домашняя работа 3
        Task7();
        Task8();
        Task9();
    }
}