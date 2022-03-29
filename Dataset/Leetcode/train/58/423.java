class Solution {
    public int XXX(String s) {
        boolean isStart = false;
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (!isStart && c == ' ') {
                continue;
            }
            if (isStart && c == ' ') {
                break;
            }
            isStart = true;
            length++;
        }
        return length;
    }
}

