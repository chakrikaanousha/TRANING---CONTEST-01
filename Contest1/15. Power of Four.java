// # Approach:

// <aside>
// 💡 n = num given 
// x = power of

// while(n>1){
// if(n%x≠0){return false;}
// n=n/x;
// }

// </aside>


class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<1) return false;
        while (n>1){
            if(n%4!=0) {
                return false;
            }
            n=n/4;
        }
        return true;
    }
}
