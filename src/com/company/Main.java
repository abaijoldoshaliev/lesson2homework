package com.company;

public class Main {

    public static void main(String[] args) {

        int PersonAge = 45;
        int temperature = 15;

        if (PersonAge > 20 && PersonAge < 45 || temperature > -20 && temperature < 30) ;
        {
            System.out.println("Можно идти гулять");
        }

        if (PersonAge < 20 || temperature > 0 && temperature < 28) ;
        {
            System.out.println("Можно идти гулять");
        }
        if (PersonAge > 45 || temperature > -10 && temperature < 25) ;
        {
            System.out.println("Можно идти гулять");
        }
        if (PersonAge > 40 && PersonAge < 47 || temperature > 20) ;
        {
            System.out.println("Оставайтесь дома");
        }
        if (PersonAge > 30 || temperature > 17 && temperature < 30) ;
        {
            System.out.println("Оставайтесь дома");
        }


    }
}