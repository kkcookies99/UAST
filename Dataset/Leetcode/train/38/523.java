 class Solution {
    public String XXX(int n) {
        if(n == 1){
            return "1";
        }
       String str= XXX(n - 1);
        char s = str.charAt(0);
       int sum = 1;
       String result = "";
        for(int i = 1; i < str.length(); i++){
            char p = str.charAt(i);
            if(p == s){
                sum++;
            } else {
                result = result + sum + s;
                sum = 1;
                s = str.charAt(i);
            }
        }
        return result + sum + s;
    }
}

