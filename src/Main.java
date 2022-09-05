public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        int yearOfIssue = 2015;
        if (clientOS == 1 && yearOfIssue >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && yearOfIssue < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        if (clientOS == 0 && yearOfIssue >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && yearOfIssue < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }


        int year= 1000;
        boolean evenOdd= year%4==0;
        if (evenOdd&&year%400==0){
            System.out.println("год является високосным");}
        else System.out.println("год не является високосным");

        int deliveryDistance = 100;
        double d=(deliveryDistance-20)/40+1;
        System.out.println(Math.ceil(d));





    }}