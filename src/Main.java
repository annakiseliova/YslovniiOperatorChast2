public class Main {
    public static void main(String[] args) {
       //Условный оператор. Часть 2. Задание 3
        System.out.println("Условный оператор. Часть 2. Задание 3");
        int year = 1900;
        boolean bigYear = (year % 100 == 0 && year % 400 == 0);
        if(year % 4 == 0) {
            if (bigYear) {
                System.out.println( year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println(year + " год не является високосным");
        }




    }
}