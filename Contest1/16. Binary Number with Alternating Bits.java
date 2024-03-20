// # Approach:

// <aside>
// 💡 1.intialise a temp and store : right shift num and add n
// temp = n>>1+n
// 2. temp & temp +1 == 0
// 3. return true

// </aside>


// > n =5  = 101
//  right shift : n >>1 : 010
// temp = n+n>>1 : 111
// temp +1 = 111+1 = 1000
// temp & temp +1 = 0000
// return True;
// >



class Solution {
    public boolean hasAlternatingBits(int n) {
        int temp = (n>>1)+n; //101+010 = 111
        int flag = temp &(temp+1);

        return (flag==0);
    }
}
