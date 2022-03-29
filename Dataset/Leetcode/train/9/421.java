 class Solution {
    int start = 0;
    int end = 0;
    public boolean XXX(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        String s = Integer.toString(x);
        int n = s.length();
        char[] chars = s.toCharArray();
        if(n % 2 == 0){
            int i = n / 2 - 1;
            int j = n / 2;
            while(i >= 0 || j < n){
                if(chars[i] == chars[j]){
                    i--;
                    j++;
                }else {
                    return false;
                }
            }
            return true;
        }else {
            int i = n / 2 - 1;
            int j = n / 2 + 1;
            while(i >= 0 || j < n){
                if(chars[i] == chars[j]){
                    i--;
                    j++;
                }else {
                    return false;
                }
            }
            return true;
        }
    }
}

