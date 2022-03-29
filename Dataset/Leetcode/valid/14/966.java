 class Solution {
    public String XXX(String[] strs) {
         //["flower","flow","flight"]
        var str1 = strs[0].toCharArray();
        //存储结果
        var cp = new StringBuilder();
        boolean a=false;
        for (int i = 0; i < str1.length; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i || strs[j].charAt(i) != str1[i]) {
                    a=true;
                    break;
                }
            }
            if(a){
                break;
            }
            cp.append(str1[i]);
        }
        return cp.toString();
    }
}

