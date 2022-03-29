 class Solution {
    public String XXX(int n) {
        if (n == 1) {
            return "1";
        }

        String s = XXX(n - 1);
        StringBuilder str = new StringBuilder();

        int count = 0;
        // i - 1
        char preChar = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // if i - 1 == i count++
            if (preChar == c) {
                count++;
            }
            // if i - 1 != i put character and its counts 
            // count = 1
            else {
                str.append("" + count + preChar);
                preChar = c;
                count = 1;
            }
        }

        // put in the last character and its counts
        str.append("" + count + preChar);

        return str.toString();
    }
}

