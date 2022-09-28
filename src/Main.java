public class Main {
    public static void main(String[] args) {
        //Условный оператор. Часть 2. Задание 4
        System.out.println("Условный оператор. Часть 2. Задание 4");
        int deliveryDistance = 95;
        int dayDelivery = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + dayDelivery);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            dayDelivery = dayDelivery + 1;
            System.out.println("Потребуется дней: " + dayDelivery);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            dayDelivery = dayDelivery + 2;
            System.out.println("Потребуется дней: " + dayDelivery);
        }else{
            System.out.println("Потребуется более 3 дней");
        }
    }
}