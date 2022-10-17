package LogicalProgram;

public class PerfectNumber {
    static void checkPerfectNum(int num) {
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;    //1  2  3  7 14 28
            }

        }
        if (num == sum) {
            System.out.println("Perfect Number");
        }else
            System.out.println("Not Perfect Number");
    }
    public static void main(String[] args) {
        checkPerfectNum(28);
    }
}

