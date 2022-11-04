package ba.rpr;

public class Main {
    public static void main(String args[]){
        if(args.length == 0){
            System.out.println("Morate unijeti funkciju");
            System.out.println("Sinus (broj)");
            System.out.println("Faktorijel (broj)");
        }

        if(args[0].equals("Sinus")){
            System.out.println("sin(" + args[1] + ") = " + Matematika.sin(Double.parseDouble(args[1])));
        }
        else if(args[0].equals("Faktorijel")){
            System.out.println(args[1] + "! = " + Matematika.faktorijel(Integer.parseInt(args[1])));
        }
        else{
            System.out.println("Netacan naziv funkcije");
        }

    }

}
