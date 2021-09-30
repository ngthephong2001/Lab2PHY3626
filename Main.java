package Lession2.DayTwo;

public class Main {

    public static long getTotalPoints(long level, long points, final long BONUS) {
        if (level >= 1 && level <= 5) {
            return points + level * BONUS;
        }
        return 0;
    }

    public static long getTotalPoints(long level, long points) {
        final long BONUS = 20;
        return getTotalPoints(level, points, BONUS);
    }

    public static long getTotalPoints(long points) {
        final long BONUS = 20;
        return getTotalPoints(3, points, BONUS);
    }

    public static void getTotalPoints1(long level, long points, final long BONUS) {
        if (level >= 1 && level <= 5) {
            double totalPoints = points + Math.sqrt(level) * BONUS;
            System.out.println("Total points: " + totalPoints);
        } else {
            System.out.println("Invalid Level");
        }
    }

    public static long Factorial(long n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * Factorial(n - 1);

    }

    public static void main(String[] args) {
        final long BONUS = 100;
        long points;
        long level;
        long totalPoints;

        level = 3;
        points = 300;
        totalPoints = getTotalPoints(level, points, 100);
        System.out.println("Total points: " + totalPoints);
        getTotalPoints1(level, points, BONUS);
        totalPoints = getTotalPoints(level, points);
        System.out.println("Total points: " + totalPoints);
        totalPoints = getTotalPoints(points);
        System.out.println("Total points: " + totalPoints);

        System.out.println("=============");
        for (int i = 100; i <= 400; i += 50) {
            totalPoints = getTotalPoints(i);
            System.out.println("Total points: " + totalPoints);
        }

        System.out.println("--------------");
        long[] p = { 100, 120, 200, 250, 500 };
        for (int i = 0; i < p.length; i++) {
            totalPoints = getTotalPoints(p[i]);
            System.out.println("Total points: " + totalPoints);
        }

        Person p1 = new Person();
        p1.setName("Nguyen The Phong");
        p1.setAge(20);
        p1.setGender('M');
        p1.setEmailAddress("nguyenthephong_t65@hus.edu.vn");
        System.out.println("Name: " + p1.getName() + " Age: " + p1.getAge() + " Gender: " + p1.getGender() + " Email: "
                + p1.getEmailAddress());

        Person p2 = new Person("Nguyen The Phong", 20, 'M', "k65hus@gmail.com");
        System.out.println("Name: " + p2.getName() + " Age: " + p2.getAge() + " Gender: " + p2.getGender() + " Email: "
                + p2.getEmailAddress());

        System.out.println("5! = " + Factorial(5));
    }
}
