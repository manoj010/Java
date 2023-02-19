public class Main {
    public static void main(String[] args) {
        int moremoney = 1;
        int moremoremoney = 1;
        int[] moneyyy = {100, 200, 300, 400, 500};

        for (int money = 1; money <= 100; money++) {
            System.out.println("Bring me Money " + money);
        }

        while(moremoney <= 100) {
            System.out.println("Money " + moremoney);
            moremoney++;
        }

        do {
            System.out.println("Money " + moremoremoney);
            moremoremoney++;
        }while(moremoremoney <= 100);

        for(int element:moneyyy) {
            System.out.println("Money " + element);
        }
    }
}