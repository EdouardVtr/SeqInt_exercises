import seqint.SeqInt;
import seqint.SeqIntIterator;
import java.util.Scanner;

public class Main {

    public static boolean estVide(SeqInt s) {

        SeqIntIterator it = s.iterator();

        return !it.hasNext();
    }

    public static int longueur(SeqInt s) {

        SeqIntIterator it = s.iterator();
        int cpt = 0;

        if (it.hasNext()) {
            while (it.hasNext()) {
                it.next();
                ++cpt;
            }
        }
        return cpt;
    }

    public static int sommeSeq(SeqInt s) {

        SeqIntIterator it = s.iterator();
        int somme = 0;

        while (it.hasNext()) {
            somme += it.next();
        }
        return somme;
    }

    public static int nbAp(SeqInt s, int val) {

        SeqIntIterator it = s.iterator();
        int cpt = 0;

        while (it.hasNext()) {
            if(it.next() == val) {
                ++cpt;
            }
        }
        return cpt;
    }

    public static double moyenneSeq(SeqInt s) {

        SeqIntIterator it = s.iterator();

        if (estVide(s)) {
            throw new RuntimeException("Séquence vide !");
        }

        int somme = 0;
        int cpt = 0;

        while (it.hasNext()) {
            somme += it.next();
            ++cpt;
        }
        return (double)somme / cpt;
    }

    public static int estMax(SeqInt s) {

        SeqIntIterator it = s.iterator();

        if (estVide(s)) {
            throw new RuntimeException("Séquence vide !");
        }

        int max = it.next();
        while (it.hasNext()) {
            int newVal = it.next();
            if (max < newVal) {
                max = newVal;
            }
        }
        return max;
    }
    
    public static int firstPos(SeqInt s, int val) {

        SeqIntIterator it = s.iterator();
        boolean find = false;
        int count = 0;
        
        if (estVide(s)) {
            throw new RuntimeException("Séquence vide !");
        }
        else {
            while (it.hasNext() && find) {
                if (it.next() != val) {
                    ++count;
                }
                else {
                    find = true;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        SeqInt s = new SeqInt(19, 2, 3, 4, 5, 15);
        SeqInt s1 = new SeqInt();
        SeqIntIterator it = s.iterator();

        Scanner scan = new Scanner(System.in);

        int val = 8;
        System.out.println(s);
        
        
    }
}
