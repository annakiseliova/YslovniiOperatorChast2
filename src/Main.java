public class Main {
    public static void main(String[] args) {
       //Условный оператор. Часть 2. Задание 2
        System.out.println("Условный оператор. Часть 2. Задание 2");
        int clientOS = 1;
        int yearOfIssue = 2008;
        if(clientOS == 0){
            if (yearOfIssue >= 2015 && yearOfIssue <= 2022){
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if(yearOfIssue < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else{
                System.out.println("Такой год еще не наступил");
            }
        } else if(clientOS == 1){
            if (yearOfIssue >= 2015 && yearOfIssue <= 2022){
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if(yearOfIssue < 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Такой год еще не наступил");
            }

        }




    }
}