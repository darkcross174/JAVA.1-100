public class Main {

    public static void main(String[] args) {

        int balance = 550;

        int amount = 100;

        int limit;
        limit = 1000;

        int bonus;

        if (amount > limit) {
            bonus = balance + amount + amount / 100;
        } else {
            bonus = balance + amount;
        }
        System.out.println(bonus);
    }


}



