 class Solution {
    public int XXX(String s) {
        int end = s.length();
        for (int i = end -1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (i == end - 1) {
                    end = i;
                } else {
                    return end - i - 1;
                }
            }
        }
        return end;
    }
}

