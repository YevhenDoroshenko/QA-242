package HW1.task4;

import java.util.Scanner;

public class Calculator {
    void start(){
        System.out.println("Калькулятор запущен.");
        System.out.println("Чтобы закрыть калькулятор введите: Stop");
        System.out.println("Введите ваше действие (число1 (+,-,*, /) число2)");

        Scanner scan=new Scanner(System.in);//создаем сканнер чтобы вводить числа с консоли
        String st =scan.nextLine();// тип вносимых данных с консоли
        //запустим цикл while т.к. мы не знаем сколько раз будет повторятся действие
        while (!st.equalsIgnoreCase("stop")){ //условие: делаем действие пока не будет эквивалентен слову stop
            if (st.contains("+")){
                //разделяем строку на два double
                //метод Double.parseDouble -получаем из строки число, в 1м параметре указываем нашу строку st,во 2м пар-ре указ. индекс элемента
                //строку разделяем с помощью .split и указываем по какому символу мы делаем разделение

                double num1=Double.parseDouble(st.split("\\+")[0]);
                double num2=Double.parseDouble(st.split("\\+")[1]);
                //вызываем нужный метод
                summ(num1,num2);
                } else if (st.contains("-")) {
                //разделяем строку на два double
                //метод Double.parseDouble -получаем из строки число, в 1м параметре указываем нашу строку st,во 2м пар-ре указ. индекс элемента
                //строку разделяем с помощью .split и указываем по какому символу мы делаем разделение

                double num1=Double.parseDouble(st.split("\\-")[0]);
                double num2=Double.parseDouble(st.split("\\-")[1]);
                //вызываем нужный метод
                minus(num1,num2);
            } else if (st.contains("*")) {
                //разделяем строку на два double
                //метод Double.parseDouble -получаем из строки число, в 1м параметре указываем нашу строку st,во 2м пар-ре указ. индекс элемента
                //строку разделяем с помощью .split и указываем по какому символу мы делаем разделение

                double num1=Double.parseDouble(st.split("\\*")[0]);
                double num2=Double.parseDouble(st.split("\\*")[1]);
                //вызываем нужный метод
                multiply(num1,num2);
            } else if (st.contains("/")) {
                //разделяем строку на два double
                //метод Double.parseDouble -получаем из строки число, в 1м параметре указываем нашу строку st,во 2м пар-ре указ. индекс элемента
                //строку разделяем с помощью .split и указываем по какому символу мы делаем разделение

                double num1=Double.parseDouble(st.split("\\/")[0]);
                double num2=Double.parseDouble(st.split("\\/")[1]);
                //вызываем нужный метод
                division(num1,num2);
            } else {
                System.out.println("Так калькулятор не работает");
            }
            System.out.println("Введите ваше действие: ");
            st =scan.nextLine();

        }

    }
    void summ(double num1, double num2){
        System.out.println("Результат: "+(num1+num2));
    }
    void minus(double num1, double num2){
        System.out.println("Результат: "+(num1-num2));
    }
    void multiply(double num1, double num2){
        System.out.println("Результат: "+(num1*num2));
    }
    void division(double num1, double num2){
        if (num2 == 0) {
            System.out.println("Делить на 0 - нельзя");
        } else {
        System.out.println("Результат: "+(num1/num2));
        }
    }
}
