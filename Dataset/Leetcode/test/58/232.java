 class Solution {
    public int XXX(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == ' ') {
                if (count > 0) {
                    return count;
                }
            } else {
                count++;
            }
        }
        return count;
    }
}

