class Solution {
    public String XXX(int n) {
        String s = "1";
        while(n -- > 1) {
            StringBuilder t = new StringBuilder();
            for(int i = 0, j = -1; i < s.length(); i = j + 1) {
                while(j + 1 < s.length() && s.charAt(i) == s.charAt(j + 1)) {
                    j ++;
                }
                t.append(j - i + 1);
                t.append(s.charAt(i));
            }
            s = t.toString();
        }
        return s;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


