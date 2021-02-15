public class TekrarEden {
    public static void main(String[] args) {
        int sayi[] = {12, 28, 75, 44, 28, 49};

        for (int i = 0; i < sayi.length; i++) {

            for (int j = i+1; j < sayi.length; j++) {
                if (sayi[i] == sayi[j]) {
                    System.out.println(sayi[i] + " ");
                }
            }

        }
    }
}
