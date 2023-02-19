public class Main {
    public static void main(String[] args) {
        int age = 100;

//        if (age == 40) {
//            System.out.println("I will buy a new house.");
//        } else if (age == 60){
//            System.out.println("I will retire.");
//        } else {
//            System.out.println("I will buy a old car.");
//        }

        switch (age){
            case 40:
                System.out.println("I will buy a house.");
                break;

            case 60:
                System.out.println("I will retire.");
                break;

            case 100:
                System.out.println("DIE!!!!");
                break;

            default:
                System.out.println("I will buy a old car.");
        }
    }
}