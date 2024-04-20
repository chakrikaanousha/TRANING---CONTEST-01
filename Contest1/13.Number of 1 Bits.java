//Number of 1 Bits
//https://leetcode.com/problems/number-of-1-bits/description/

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int cnt =0; 
        int res = 1;


        int i=0; 
        while(i<32){
            if((n & res)!=0){cnt ++;}
            //left shift the res
            //res =res<<1;
            n = n>>1;
            i++;
        }
        return cnt;
        
    }
}
