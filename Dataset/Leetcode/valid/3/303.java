 class Solution {
    public int XXX(String s) {
        int maxLength = 0;
        boolean[] table = new boolean[127];
        for (int left = 0, right = 0;right < s.length();left++) {
            while (right < s.length() && !table[s.charAt(right)]) {
                table[s.charAt(right++)] = true;
            }
            maxLength = Math.max(right - left, maxLength);
            table[s.charAt(left)] = false;
        }
        return maxLength;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

