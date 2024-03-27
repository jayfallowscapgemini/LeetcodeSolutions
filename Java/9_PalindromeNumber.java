class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
        {
            return false; // if x is a negative number it cannot be palindrome
        }

        long reversed = 0; // variable to store the reversed value of x
        long temp = x; // temp number to store the value of x without changing it

        while (temp != 0)
        {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10; 
        }

        return (reversed == x); // return true if reversed is equal to x
    }
}
