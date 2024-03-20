//Approach 1.: time complexity: 2118ms
        // 1. Get the divisors of a number and store them in a list:
        // 1.1. ArrayList creation
        // 2. Iterate from 1 up to one less than the number
        // 3. If i divides num without remainder
        // 4. Add i to the list of divisors
        // 5. Sum of the divisors



class Solution {
    public boolean checkPerfectNumber(int num) {
        //get the divisors of a number, and store it in a list:
        //1. arraylist creation
        List<Integer> divisors = new ArrayList<>();

        // 2. Iterate from 1 up to one less than the number
        for (int i = 1; i < num; i++) {
            // 3. If i divides n without remainder
            if (num % i == 0) {
                // 4. Add i to the list of divisors
                divisors.add(i);
            }
        }
        //5.sum of the divisors
        int sum = 0;
        for (int n : divisors) {
            sum += n; // Add each element to the sum
        }

        if(sum==num){
            return true;
        }

        return false;
    }
}

//Approach 2: Time: 1ms

// Approach:

// 1. Start with initializing `sum` as 1 because 1 is always a divisor of any number.
// 2. Iterate from 2 up to the square root of `num`.
// 3. If `i` divides `num` without remainder, add `i` to the `sum`.
// 4. Also, add the paired divisor (`num / i`) if it's not the square root.
// 5. Check if the sum of divisors equals `num`, return true if yes, false otherwise.

class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false; // 1 is not a perfect number
        }
        
        int sum = 1; // Start with 1 as 1 is always a divisor of any number
        
        // Iterate from 2 up to one less than num
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i; // Add divisor
                if (i != num / i) {
                    sum += num / i; // Add the paired divisor
                }
            }
        }
        
        return sum == num; // Check if the sum equals num
    }

}
