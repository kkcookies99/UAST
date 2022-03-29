 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        int len = s.length();
        char[] res = new char[len];
        int mod = numRows * 2 - 2;
        int a = len % mod;
        int b = len / mod;
        int[] fix = new int[numRows-1];
        for(int i = 0; i < numRows-1; i++){
            if(i == 0){
                fix[i] = b;
                if(a > i){
                    fix[i]++;
                }
            }
            else{
                fix[i] = 2 * b;
                if(a > numRows){
                    fix[i]++;
                    if(a > numRows + numRows-i-2){
                        fix[i]++;
                    }
                }
                else{
                    if(a > i)
                        fix[i]++;
                }
            }
            if(i!=0)
                fix[i] += fix[i-1];
        }
        for(int i = 0; i < len; i++){
            char ch = s.charAt(i);
            int c = i / mod;
            int d = i % mod;
            int line = 0, p = 0;
            if(d < numRows){
                line = d;
                if(d == 0 || d == numRows-1){
                    p = 1;
                }
                else{
                    p = 2;
                }
            }
            else{
                line = numRows + numRows - d - 2;
                p = 2;
            }
            if(line != 0){
                line = fix[line-1];
            }
            int aim = line + p * c;
            if(d >= numRows){
                aim++;
            }
            res[aim] = ch;
        }
        return new String(res);
    }
}

