public class Main {
    public static void main(String[] args) {
        //Условный оператор. Часть 2. Задание 5
        System.out.println("Условный оператор. Часть 2. Задание 5");
        int monthNomber = 12;

        switch (monthNomber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Не существует такой месяц");
        }

    }
}