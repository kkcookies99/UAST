 class Solution {
    public String XXX(String[] strs) {
        if (strs.length == 1 && strs[0].equals("")) {
            return "";
        }
        String pre = "";
        for(int i = 0, len1 = strs[0].length(); i < len1; i++) {
            char ch = strs[0].charAt(i);
            for(int j = 1, len = strs.length; j < len;j++) {
                if (i >= strs[j].length() || ch != strs[j].charAt(i)) {
                    return pre;
                }
            }
            pre+=ch;
        }
        return pre;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


