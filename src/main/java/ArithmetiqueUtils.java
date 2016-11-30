/**
 * Created by xyz on 23/11/16.
 */
public class ArithmetiqueUtils
{
    public static int pgcd(int a, int b)
    {
        int nbr1,nbr2,temp,rest,num1,den1;
        nbr1=a;
        nbr2=b;
        rest=1;

        if (nbr1<nbr2) {temp=nbr1;nbr1=nbr2;nbr2=temp;}

        while (rest != 0)
        {
            rest=nbr1 % nbr2;
            nbr1=nbr2;
            nbr2=rest;
        }
        return nbr1;
    }

}
