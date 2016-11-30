/**
 * Created by xyz on 23/11/16.
 */
// N'hesite pas a mettre des Systems.out.println("kjlj") dans les methodes de cette classe
// pour comprendre ce qui se passe
public class Fraction
{
        //ici les attributs num et den sont private et final
        // final --> tu es OBLIGÉ d'avoir un construction qui les initalise
        // et une fois qu'ils ont été initalisés tu ne peux plus les modifier
        // private --> tu ne peux que utiliser ces attibuts à l'interieur de la
        // class Fraction
        private final int num;
        private final int den;

        // Ici le constructeur.
        public Fraction(int num, int den)
        {
            this.num = num;
            this.den = den;
        }


        public Fraction toFractionIrreductible()
        {
            int pgcd = ArithmetiqueUtils.pgcd(this.num, this.den); // int pgcd est une variable de type int et pgcd(..., ...) un appel a la methode privé pgcd
            int numReduit = this.num / pgcd;
            int denReduit = this.den / pgcd;

            // Et enfin tu construit une nouvelle instance de fraction avec tes nouvelles valeurs
            return new Fraction(numReduit, denReduit);
        }

    public Fraction fois(Fraction other)
    {
       int num3=this.num*other.num;
       int den3=this.den*other.den;
       // Et enfin tu construit une nouvelle instance de fraction avec tes nouvelles valeurs
       return new Fraction(num3, den3).toFractionIrreductible();
    }


    //Cette methode est static car d'une maniere sémantique elle n'appartient pas vraiment a la classe
        // Fraction. Le pgcd est utilisé de maniere plus générale que simplement la reduction de
        // fraction. Du coup sa vrai place et dans une Classe "d'aide". Mais pour l'instant par simplicite
        // on la laisse ici.

        // Ces deux methodes sont des "getters" aucune logique ici, simplement un access en
        // lecture au attributs. Et effet l'utilisateur de la classe, dans ton programme c'est le
        // main, ne peut pas modifier la valeur de num
        public int getNum() {
            return num;
        }
        public int getDen() {
            return den;
        }

        // On decrit a Java comment convertir cette object en String. Puisque toString est une methode
        // standard, on utilise l'annotation @Override qui est toutefois pas obligatoire.
        @Override
        public String toString() {
            return  num + "/" + den;
        }

}
