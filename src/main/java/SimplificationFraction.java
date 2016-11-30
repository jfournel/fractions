import java.util.Scanner;

public class SimplificationFraction {
    public static void main(String[] args)
    {
        //entrée de la fraction à rendre irréductible
        Scanner scanner=new Scanner(System.in);
        System.out.print("Entre le numérateur : ");
        int num1= Integer.parseInt(scanner.next());
        System.out.print("Entre le dénominateur : ");
        int den1= Integer.parseInt(scanner.next());

        //calculs
        Fraction f1 = new Fraction(num1,den1);
        Fraction f2 = f1.toFractionIrreductible();
        //affichage de la fraction irréductible
        System.out.println(f1.getNum() + "/" +f1.getDen() + " = " + f2.getNum() + "/" + f2.getDen() );
        System.out.println(f1.fois(f2));
        System.out.println(f1+ " = " + f2 );
    }

}


