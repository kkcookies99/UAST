 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows < 2) return s;
        StringBuilder[] ans = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++) ans[i] = new StringBuilder();//每一行放进一个字符串中最后再合并
        int len = s.length();
        int index = 0, row = 0;
        while(index < len) {
            //先向下遍历
            while(index < len && row < numRows) {
                char ch = s.charAt(index);
                ans[row].append(ch);
                index++;
                row++;
            }
            if(index == len) break;
            row -= 2;//找到中间的。
            while(index < len && row >= 0) {
                char ch = s.charAt(index);
                ans[row].append(ch);
                index++;
                row--;
            }
            row += 2;
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < numRows; i++) {
            res.append(ans[i]);
        }
        return res.toString();
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

