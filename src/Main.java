public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();
        System.out.println("Задача 2");
        int temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        System.out.println();
        System.out.println("Задача 3");
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
        System.out.println();
        System.out.println("Задача 4");
        int personAge = 15;
        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если возраст человека равен " + personAge + " то ему нужно ходить в детский сад");
        }
        if (personAge >= 7 && personAge <= 17) {
            System.out.println("Если возраст человека равен " + personAge + " то ему нужно ходить в школу");
        }
        if (personAge >= 18 && personAge <= 24) {
            System.out.println("Если возраст человека равен " + personAge + " то ему нужно ходить в университет");
        }
        if (personAge > 24) {
            System.out.println("Если возраст человека равен " + personAge + " то ему нужно ходить на работу");
        }
        System.out.println();
        System.out.println("Задача 5");
        int childAge = 5;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + " то ему нельзя кататься на аттракционе");
        }
        if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (childAge >= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + " то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println();
        System.out.println("Задача 6");
        int howManySeatsAreOccupied = 102;
        if (howManySeatsAreOccupied > 0 && howManySeatsAreOccupied < 60) {
            System.out.println("В вагоне есть сидячее место");
        } else if (howManySeatsAreOccupied >= 60 && howManySeatsAreOccupied < 102) {
            System.out.println("В вагоне есть стоячее место");
        } else {
            System.out.println("Вагон полностью забит");
        }
        System.out.println();
        System.out.println("Задача 7");
        int one = 20;
        int two = 25;
        int three = 12;
        if (one > two && one > three) {
            System.out.println("Число one больше остальных");
        } else if (two > one && two > three) {
            System.out.println("Число two больше остальных");
        } else {
            System.out.println("Число three больше остальных");
        }
    }
}













