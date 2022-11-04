package ba.rpr;

public class Matematika {

    public static Long faktorijel(int broj){
        Long faktorijelRezultat = 1L;
        for(int i=2; i<=broj; i++)
            faktorijelRezultat *= i;
        return faktorijelRezultat;
    }

   public static double sin(double x){
       double t = x;
       double sine = t;
       for ( int a=1; a<5; ++a)
       {
           double mult = -x*x/((2*a+1)*(2*a));
           t *= mult;
           sine += t;
       }
       return sine;
   }
}
