 class Solution {
    public int XXX(String s) {
        int count = 0;
        char[] arr = s.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != ' ') {
                count++;
            } else if (count > 0) {
                return count;
            }
        }
        return count;
    }
}

