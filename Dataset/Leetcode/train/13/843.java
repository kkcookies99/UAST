 class Solution {
    public int XXX(String s) {
        char[] sc = s.toCharArray();
        int res = 0, tmp = 0;
        for(char i : sc){
            switch(i){
                case 'M' : if(tmp < 1000) res -= 2 * tmp;
                    tmp = 1000; break;
                case 'D' : if(tmp < 500) res -= 2 * tmp;
                    tmp = 500; break;
                case 'C' : if(tmp < 100) res -= 2 * tmp;
                    tmp = 100; break;
                case 'L' : if(tmp < 50) res -= 2 * tmp;
                    tmp = 50; break;
                case 'X' : if(tmp < 10) res -= 2 * tmp;
                    tmp = 10; break;
                case 'V' : if(tmp < 5) res -= 2 * tmp;
                    tmp = 5; break;
                case 'I' : tmp = 1; break;
            }
            res += tmp;
        }
        return res;
    }
}```

