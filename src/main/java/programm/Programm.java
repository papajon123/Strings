package programm;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Alex123 on 14.08.2016.
 */
public class Programm {
    public static final int DATA_BORN=125;//это называется стическая константа
    public static void main(String[] args) {
        String str = "StrIng";
        for(int i=0;i<str.length();i++)
            System.out.println(Character.isUpperCase(str.charAt(i)));
        //str.charAt()
        Character.isUpperCase('A');//возвращает true или false если символ с большой буквы
        System.out.println(Character.isUpperCase('S'));
        System.out.println(Character.isDigit('5'));//возвращает true если мисвол является цифрой
        System.out.println(Character.isLetter('S'));// является ли символ буквой
        System.out.println(Character.digit('5',3));// переводит символ цифры в интовое число в системе счисления, определённой в переменной radix
        System.out.println(Character.toLowerCase('F'));//
        System.out.println(Character.toLowerCase('F'));//пампр
        LinkedList<Integer> list = new LinkedList<Integer>(); //лам где требудется параметрические типы,
        //необходимо использовать сылочные типа, а не примитивниые
        //если требуется применять примитивные типы то необходимо использовать их класы обвёртки
        //int-Integer,boolean-Boolean,double-Double,long-Long
        for(int i=0;i<=100;i++){
            list.add(i);
            System.out.print(list.get(i)+" ");
        }
        System.out.println(DATA_BORN);


    }
}
