 class Solution {
    public int XXX(String s) {
        int ret = 0; int last = -1;
        int[] key = {1000, 500, 100, 50, 10, 5, 1};
        char[] rom = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
        for (char c : s.toCharArray()) {
            for(int i = 0; i<7; i++){
                if(c==rom[i]){
                    ret+=key[i];
                    if(i<last){
                        ret-=2*key[last];
                    }
                    last = i;
                }
            }
        }
        return ret;
    }
}

