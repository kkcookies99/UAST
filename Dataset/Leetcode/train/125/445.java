 class Solution {
    public boolean XXX(String s) {
        char[] chs = s.trim().toLowerCase().toCharArray();

        for (int l = 0, r = chs.length - 1; l < r; l++, r--) {
            while (l < r && (!Character.isLetterOrDigit(chs[l]))) {
                l++;
            }
            while (l < r && (!Character.isLetterOrDigit(chs[r]))) {
                r--;
            }
            if (l < r && chs[l] != chs[r]) return false;
        }
        return true;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


