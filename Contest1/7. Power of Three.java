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
    public boolean isPowerOfThree(int n) {
        if(n<1) return false;
        while (n>1){
            if(n%3!=0) {
                return false;
            }
            n=n/3;
        }
        return true;
    }
}

