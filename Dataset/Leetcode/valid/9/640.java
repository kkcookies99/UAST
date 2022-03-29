 class Solution {
    public boolean XXX(int x) {
        String s = String.valueOf(x);
        int left = 0, right = s.length() - 1;== 1) return true;
        while(left <= right - 1 && s.charAt(left) == s.charAt(right)){
                left++;
                right--;
        }
        return left == right || left == right + 1;
    }
}

