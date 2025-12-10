import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Main {

    public static SeqInt Max2AndMax1(SeqInt s1) {
        SeqIntIterator it = s1.iterator();

        if (!it.hasNext()) {
            throw  new RuntimeException("Séquence vide !");
        }
        int max1 = it.next(); // max1 correspond à la plus grande valeur.
        int max2;
        if (it.hasNext()) {
            int newVal = it.next();
            if (newVal > max1) {
                max2 = max1;
                max1 = newVal;
            }
            else {
                max2 = newVal;
            }
        }
        else {
            max2 = max1;
        }
        while (it.hasNext()) {
            int newVal = it.next();
            if (newVal > max1) {
                max2 = max1;
                max1 = newVal;
            }
            else if (newVal > max2) {
                max2 = newVal;
            }
        }
        SeqInt m2m1 = new SeqInt(max2, max1);
        return m2m1;
    }

    public static void main(String[] args) {

        SeqInt s1 = new SeqInt(-1, 0, -8, -45, -52, 95);
        SeqInt rep = Max2AndMax1(s1);
        SeqIntIterator it = rep.iterator();
        int max2 = it.next();
        int max1 = it.next();
        if (max2 == max1) {
            System.out.println("La séquence ne comporte qu'une valeur !");
        }
        else {
            System.out.println("Les deux plus grandes valeurs de la séquence sont " + max2 + " et " + max1 + ".");
        }
    }
}
