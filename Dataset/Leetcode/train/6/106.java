 class Solution {
    public String XXX(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            if (i == 0 || i == numRows - 1) {
                for (int j = i; j < s.length(); j += 2 * (numRows - 1)) {
                    ans.append(s.charAt(j));
                }
            } else {
                for (int j = i, k = 2 * (numRows - 1) - i;
                     j < s.length() || k < s.length();
                     j += 2 * (numRows - 1), k += 2 * (numRows - 1)) {
                    if (j < s.length()) ans.append(s.charAt(j));
                    if (k < s.length()) ans.append(s.charAt(k));
                }
            }
        }
        return ans.toString();
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

