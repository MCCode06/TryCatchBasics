import java.util.*;

public class Main {
    public static void main(String[] args) {

        int size = 4;
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }

        try {
            arr[4] = 12;
            int division = arr[3]/0;
        }
        catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Bele kod yazirlar ee? Gele error: " + e.getClass().getSimpleName());
        }


        try {
            Rekurs.recursive();
        }
        catch (StackOverflowError e) {
            System.out.println("Altini qoymusan ee: " + e.getClass().getSimpleName());
        }


        try {
            int[] memoryKiller = new int[100_000 * 100_000];
        }
        catch (OutOfMemoryError e) {
            System.out.println("Yaddas qoymadin ee? Gele error: " + e.getClass().getSimpleName());
        }


    }
}