public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        int age = 23;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то он не достиг совершеннолетия, нужно немного подождать");
        }


        int temperature = 7;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }


        int speed = 59;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " , то придётся заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно");
        }


        age = 24;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детский сад");
        } else  if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить на работу");
        }



        age = 13;
        if (age < 5) {
            System.out.println("Если возраст ребёнка равен " + age + " , то ему нельзя кататься на аттракционе");
        } else if (age > 5 && age < 14) {
            System.out.println("Если возраст ребёнка равен " + age + " , то ему можно кататься на аттракционе с сопровождением взрослого");
        } else {
            System.out.println("Если возраст ребёнка равен " + age + " , то ему можно кататься без сопровождения взрослого");
        }


        int wagonCapacity = 40;
        if (wagonCapacity > 60 && wagonCapacity < 102) {
            System.out.println("Есть стоячие места");
        } else if (wagonCapacity < 60) {
            System.out.println("Есть сидячие места");
        } else {
            System.out.println("Нет мест");
        }


        int one = 1;
        int two = 2;
        int three = 3;
        if (three > two && three > one) {
            System.out.println("Три наибольшее число");
        } else if (two > three && two > one) {
            System.out.println("Два наибольшее число");
        } else {
            System.out.println("Один наибольшее число");
        }
    }
}
