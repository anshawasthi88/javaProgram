package test;
import java.util.Arrays;

public class SubarrayFind {

    public static int solve(String s){
        int n = s.length();
        int max = 0;
        int[] hash = new int[256];
        Arrays.fill(hash,-1);
        int left = 0;
        int right = 0;
//        int temp = 1;
//        System.out.println(hash[s.charAt(temp) - 'a']);
        while(right < n ){
//            System.out.println(s.charAt(right) + " " + hash[s.charAt(right)]);
            System.out.println(hash[s.charAt(right)]);
            if(hash[s.charAt(right)] != -1 ){
                left = Math.max(left , hash[s.charAt(right)]+1 );
            }
            hash[s.charAt(right)] = right;
            max = Math.max(max,right-left+1);
            right++;
        }
        return max;
    }

    public static void main(String[] args) {
        String test = "cadbzabdc";
        System.out.println(solve(test));
    }
}
