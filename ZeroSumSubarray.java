import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        String[] inputArr= input.split(" ");
        int arr[]=new int[inputArr.length];
        
        for(int i =0;i<inputArr.length;i++){
            arr[i]=Integer.parseInt(inputArr[i]);
        }
        
        if(subArrayZeroexist(arr,arr.length)){
            System.out.println("True");
            
        }
        else{
            System.out.println("False");
        }
            
            System.out.println(arr.length);
        }
    
        static boolean subArrayZeroexist(int arr[],int n){
            Set <Integer> set = new HashSet<>();
            int sum=0;
            for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0 || set.contains(sum)){
            return true;}
        set.add(sum);
        }
        return false;
}
        }
