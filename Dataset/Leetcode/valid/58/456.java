class Solution {
    public int XXX(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && count == 0) {
                continue;
            }
            if (s.charAt(i) == ' ' && count != 0) {
                break;
            }
            count++;
        }
        return count;
    }
}

