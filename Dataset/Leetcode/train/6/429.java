 class Solution {
    public String XXX(String s, int numRows) {
        if (numRows == 1) return s;
        String[] strings = new String[numRows];
        int row = 0;
        boolean flag = true;
        for(int i = 0; i < strings.length; ++i) strings[i] = "";
        for(int i = 0; i < s.length(); ++i) {
            strings[row] += s.charAt(i);
            if (row % (numRows - 1) == 0) {
                if (row != 0) flag = false;
                else flag = true;
            }
            if (flag) row++;
            else row--;
        }
        StringBuilder sb = new StringBuilder();
        for(String ss : strings) sb.append(ss);
        return sb.toString();
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


