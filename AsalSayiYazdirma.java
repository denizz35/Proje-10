import java.util.ArrayList;
import java.util.Arrays;

public class AsalSayiYazdirma {

    public static void main(String[] args) {
        int[] asalSayilar = asalSayilar(20);
        for (int sayi : asalSayilar) {
            System.out.print(sayi + " ");
        }
    }

    public static int[] asalSayilar(int limit) {
        ArrayList<Integer> asalSayilarList = new ArrayList<>();
        boolean[] isAsal = new boolean[limit + 1];
        Arrays.fill(isAsal, true);
        for (int i = 2; i <= limit; i++) {
            if (isAsal[i]) {
                asalSayilarList.add(i);
                for (int j = i * i; j <= limit; j += i) {
                    isAsal[j] = false;
                }
            }
        }
        int[] asalSayilar = new int[asalSayilarList.size()];
        for (int i = 0; i < asalSayilarList.size(); i++) {
            asalSayilar[i] = asalSayilarList.get(i);
        }
        return asalSayilar;
    }
}