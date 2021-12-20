public class ATM {
    public static int countBanknotes(int sum) {
        int result = 0;
        while (true) {
            if (sum == 0)
                return result;
            if (sum >= 500) {
                sum -= 500;
                result += 1;
                ;
            } else if (sum >= 200) {
                sum -= 200;
                result += 1;
            } else if (sum >= 100) {
                sum -= 100;
                result += 1;
            } else if (sum >= 50) {
                sum -= 50;
                result += 1;
            } else if (sum >= 20) {
                sum -= 20;
                result += 1;
            } else if (sum >= 10) {
                sum -= 10;
                result += 1;
            } else if (sum >= 5) {
                sum -= 5;
                result += 1;
            } else if (sum >= 2) {
                sum -= 2;
                result += 1;
            } else if (sum >= 1) {
                sum -= 1;
                result += 1;
            }
        }
    }
}