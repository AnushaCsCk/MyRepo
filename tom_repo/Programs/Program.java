package tom_repo.Programs;

public class Program {
    public static void main(String[] args) {
        for(int i = 0;i<5;i++){
            System.out.println("Something Interesting");
        }

        
        System.out.println(isPalindrome(201));
    }


    public static boolean isPalindrome(int number){

        int reverse = 0;
        int temp = number;
        while (number != 0) {

            int digit = number % 10;
            reverse = (reverse * 10) + digit;
            number = number / 10;

        }
        if (temp == reverse) {
            return true;
        }

    return false;
}
} 
