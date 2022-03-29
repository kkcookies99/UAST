 class Solution {
    public String XXX(int n) {
        String num = "1";
        String result = "";
        for(int i = 0; i < n - 1; i++){
            char cur = num.charAt(0);
            int count = 0;
            int len = num.length();
            for(int j = 0; j < len ; j++){
                char ch = num.charAt(j);
                if(ch == cur){
                    count++;
                }else{
                    result += count+""+cur;
                    cur = ch;
                    count = 1;
                }
            }
            if(count!=0){
                result += count + "" + num.charAt(len-1);
            }
            num = result;
            result = "";
        }
        return num;
    }
}

