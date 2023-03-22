package Ej2;

public class PrePostDemo {
    public static void main(String[] args){
        int i = 3;
        i++;
        System.out.println(i);// 4
        ++i;
        System.out.println(i);//5
        System.out.println(++i);//6 , priero se le suma a la variable i y despues se la usa.
        System.out.println(i++);//6 , primero se usa la variable i y despues se le suma uno.
        System.out.println(i);//7
    }
}
