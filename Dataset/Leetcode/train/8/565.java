 class Solution {
    public int XXX(String str) {
        int fu = 0,start = 0;
        long res = 0;
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(start == i && ch == ' '){
                start++;
                continue;
            }
            if(i == start && ch == '-'){
                fu = 2;
                continue;
            }
            if(i == start && ch == '+'){
                continue;
            }
            if(ch >= '0' && ch <= '9'){
                res = res * 10 + ch-'0';
            }else {
                break;
            }
            if(fu != 2 && res > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(fu == 2 && res > Integer.MAX_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        return fu== 2 ? -(int)res : (int)res;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


