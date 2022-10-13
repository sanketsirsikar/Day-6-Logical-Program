package LogicalProgram;

public class ReverseNumber {
    public static void  ReverseNum(int num , int reverse){
        while (num!=0) {
            int remender = num % 10;
            reverse = reverse * 10 + remender;
            num = num / 10;
        }
        System.out.println("The reverse number is " + reverse);
    }

    public static void main(String[] args) {
        ReverseNum(1234, 0);
    }
}

