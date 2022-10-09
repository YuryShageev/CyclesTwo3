public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;
        int asOfYear = currentYear - 200;
        int ending = currentYear + 100;
        for (int i = asOfYear; i < ending; ++i) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }


        for (int i = 1; i <= 9; i++) {
            System.out.println("2*" + i + " =" + 2 * i);
        }
    }
}