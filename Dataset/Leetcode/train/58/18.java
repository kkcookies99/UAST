 class Solution {
    public int XXX(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                for (int j = i; j >= 0; j--) {
                    if (s.charAt(j) == ' ') {
                        return i - j;
                    } else if (s.charAt(j) != ' ' && j == 0) {
                        return i - j + 1;
                    }
                }
            }
        }
        return count;
    }
}

