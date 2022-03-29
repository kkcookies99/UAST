class Solution {
    public boolean XXX(int x) {
      String s = new Integer(x).toString();
        String s2 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            s2 += c;
        }
        return s2.equals(s);
    }
}
// 执行用时: 102 ms, 在Palindrome Number的Java提交中击败了94.43% 的用户

