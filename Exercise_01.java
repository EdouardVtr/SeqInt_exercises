import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Main {

    public static boolean estVide(SeqInt s) {

        SeqIntIterator it = s.iterator();

        return it.hasNext();
    }
    public static void main(String[] args) {

        SeqInt s = new SeqInt(1, 2, 3, 4, 5);

        SeqIntIterator it = s.iterator();

        if (estVide(s)) {
            System.out.println("Pas vide");
        }
        else {
            System.out.println("Vide");
        }
    }
}
