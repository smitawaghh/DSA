class Solution {
    public int secondHighest(String s) {

    
        int largest = -1;
        int second = -1;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                int num = ch - '0';

                if (num> largest) {
                    second = largest;
                    largest = num;
                    
                }
                else if(num < largest && num > second) {
                    second = num;
                }
            }
        }
        return second;
    }
}
