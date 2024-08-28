import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        // Задача №1
        {
            int age = 19;
            boolean ageOfPerson = age >= 18;
            if (ageOfPerson) {
                System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
            } else {
                System.out.println("Если возраст человека равен " +
                        age + " то он не достиг совершеннолетия, нужно немного подождать");
            }
            System.out.println();
        }

        // Task №2
        {
            int temperature = 15;
            boolean airTemperature = temperature <= 5;
            if (airTemperature) {
                System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
            } else {
                System.out.println("Сегодня " + temperature + " градусов, можно идти без шапки");
            }
            System.out.println();

        }
        // Task #3
        {
            int speed = 61;
            boolean speedCar = speed > 60;
            if (speedCar) {
                System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
            } else {
                System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
            }
            System.out.println();
        }
        // task #4
        {
            int age = 5;
            if (age >= 2 && age <= 6) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад. ");
            }
            if (age >= 7 && age <= 17) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу. ");
            }
            if (age >= 18 && age <= 24) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет. ");
            }
            if (age > 24) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу. ");
            }
            System.out.println();
        }
        // Task #5
        {
            int age = 12;
            if (age < 5) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
            } else if (age >= 5 && age < 14) {
                System.out.println("Если возраст ребенка равен " +
                        age + ", то ему можно кататься на аттракционе в сопровождении.");
            } else {
                System.out.println("Если возраст ребенка равен " +
                        age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
            }
        }
        {
            int age = 4;
            boolean isChildUnderFive = age < 5;
            boolean isAgeBetweenFiveAndFourteen = age >= 5 && age < 14;
            if (isChildUnderFive) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
            } else if (isAgeBetweenFiveAndFourteen) {
                System.out.println("Если возраст ребенка равен "
                        + age + ", то ему можно кататься на аттракционе в сопровождении.");
            } else {
                System.out.println("Если возраст ребенка равен "
                        + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
            }
            System.out.println();
        }
        // Task #6
        {
            int totalSeats = 102;
            int seating = 60;
            int standingSeats = totalSeats - seating;
            int totalHumanCameIn = 101;
            if (totalHumanCameIn >= seating && totalHumanCameIn < totalSeats) {
                int sedentaryMan = 0;
                int standingMan = standingSeats - (totalHumanCameIn - seating);
                System.out.println("В вагоне есть " + sedentaryMan + " сидячих мест , и " +
                        standingMan + " стоячих мест.");
            } else if (totalHumanCameIn < seating) {
                int sedentaryMan = seating - totalHumanCameIn;
                int standingMan = standingSeats;
                System.out.println("В вагоне есть " + sedentaryMan + " сидячих мест , и " +
                        standingMan + " стоячих мест.");
            } else {
                System.out.println("Вагон уже полностью забит");
            }
            System.out.println();
        }
        // task #7
        {
            int one = 1;
            int two = 10;
            int three = 10;
            int max;
            if (one >= two && one >= three) {
                max = one;
            } else if (two >= one && two >= three) {
                max = two;
            } else {
                max = three;
            }
            System.out.println("Самое большое число " + max);
        }

    }
}