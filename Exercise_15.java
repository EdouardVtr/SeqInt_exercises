import seqint.SeqInt;
import seqint.SeqIntIterator;

public class Main {

    public static SeqInt MinAndMax(SeqInt s1) {
        SeqIntIterator it = s1.iterator();

        if (!it.hasNext()) {
            throw  new RuntimeException("Séquence vide !");
        }
        int max = it.next();
        int min = max;
        while (it.hasNext()) {
            int newVal = it.next();
            if (newVal > max) {
                max = newVal;
            }
            else if (newVal < min) {
                min = newVal;
            }
        }
        SeqInt rep = new SeqInt(min, max);
        return rep;
    }

    public static void main(String[] args) {

        SeqInt s1 = new SeqInt(1);
        SeqInt MinAndMax = MinAndMax(s1);
        SeqIntIterator it = MinAndMax.iterator();

        System.out.println("Le minimum de cette séquence est : " + it.next());
        System.out.println("Le mimimum de cette séquence est : " + it.next());
    }
}
