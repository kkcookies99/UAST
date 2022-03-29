 class Solution {
    public String XXX(int n) {
        String str = "1";
        for (int i = 2; i <= n; i++){
            str = getNextString(str);
        }
        return str;
    }

    public String getNextString(String str){
        int count = 1;
        char val = str.charAt(0), ch;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == val){
                count++;
            }else {
                sb.append(count).append(val);
                val = ch;
                count = 1;
            }
        }
        return sb.append(count).append(val).toString();
    }
}

