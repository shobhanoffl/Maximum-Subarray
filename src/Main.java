import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int maxSum = sc.nextInt();
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }

        int tot=0;
        int curr=-1;
        boolean gotMax=false;
        for(int i=0; i<size; i++){
            if(tot+array[i]<maxSum){
                tot+=array[i];
            } else if (tot+array[i]==maxSum) {
                System.out.println(maxSum);
                gotMax=true;
                break;
            } else{
                curr=i;
                break;
            }
        }
        if(curr!=-1){
            for(int i=0; i<size; i++){
                if(tot-array[i]+array[curr]==maxSum){
                    System.out.println(maxSum);
                    gotMax=true;
                    break;
                }
            }
        }
        if(!gotMax){
            System.out.println(0);
        }

    }
}