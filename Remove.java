package Javanine;

    import java.util.Scanner;

    public class Remove {
        public static void main (String [] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter ten numbers:");
            int [] numbers = new int [10];
            for(int i = 0; i <numbers.length; i ++){
                numbers [i] = input.nextInt();
            }
            int [] newlist = eliminateDuplicates (numbers);
            System.out.print("The distinct numbers are: ");
            for(int u:newlist)
            System.out.print(u +",");
        }


        public static int [] eliminateDuplicates(int [] numbers){

            int count = 1;

            for(int i = 1; i <numbers.length; i ++){
                for(int j = i-1; j >= 0; j--){
                    if(numbers [j] == numbers [i])
                    break;
                else if(j == 0)
                    count ++;
                }
            }
            int [] result=new int[count];
            result[0] = numbers[0];
            int count1 = 0;
            for(int i = 1; i <numbers.length; i ++){
                for(int j = i-1; j >= 0; j-- ){
                    if(numbers [j] == numbers [i])
                    break;
                else if(j == 0){
                        count1 ++;
                        result[count1] =numbers[i];
                    }
                }
            }
            return result;
        }
}
