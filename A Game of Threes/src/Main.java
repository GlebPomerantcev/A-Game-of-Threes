import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        while (input != 1)
            if (input%3==0){
                System.out.println(input+ " 0");
                input/=3;
            }
            else if(input%3==1){
                System.out.println(input + " -1");
                input=(input-1)/3;
            }
            else {
                System.out.println(input + " +1");
                input=(input+1)/3;
            }
        System.out.println(input);
    }
}
