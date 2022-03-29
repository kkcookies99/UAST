 class Solution {
    public int XXX(String str) {
        StringBuilder s = new StringBuilder(str);
        int len = s.length();
        int fu = 1;
        int count = -1;
        long result = 0;
        for(int i=0;i<len;i++){
            char c = s.charAt(i);
            if(count==-1){
                if(c==' ') continue;
                if(c=='-'){
                    fu = -1;
                    count=i;
                }
                else if(c=='+'||(c>='0'&&c<='9')){
                    count=i;
                }
            }
            if(i>=count){
                if(i==count&&(c=='-'||c=='+')) continue;
                if(c>='0'&&c<='9'){
                    result = result*10+c-'0';
                    if(result*fu<0x80000000){
                        return 0x80000000;
                    }
                    else if(result*fu>0x7fffffff){
                        return 0x7fffffff;
                    }
                }
                else{
                    break;
                }
            }
        }
        return (int)result*fu;
    }
}

