 class Solution {
    public String XXX(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        // (r - 1) * 2
        // X = (numRows - 1) * 2
        // i + X

        // String ans = "";
        StringBuilder ans = new StringBuilder();

        int sub = (numRows - 1) * 2;
        for (int i = 0; i < numRows; i++) {
            int index = 0 + i;
            while (index < s.length()) {
                //ans += s.charAt(index);
                ans.append(s.charAt(index));
                if ((index + sub - i * 2) < s.length() && i != 0 && i != numRows - 1) {
                    //System.out.println(index + " " + sub + " " + i);
                    //ans += s.charAt(index + sub - i * 2);
                    ans.append(s.charAt(index + sub - i * 2));
                }
                index += sub;
            }
        }

        return ans.toString();
    }
}

