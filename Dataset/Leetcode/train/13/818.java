 class Solution {
    public int XXX(String s) {
        char[] chars1 = s.toCharArray();
            Integer res=0;
            for (int i = 0; i < chars1.length; i++) {
                if (chars1[i]=='I'){
                    chars1[i]=1;
                }else if (chars1[i]=='V'){
                    chars1[i]=5;
                }else if (chars1[i]=='X'){
                    chars1[i]=10;
                }else if (chars1[i]=='L'){
                    chars1[i]=50;
                }else if (chars1[i]=='C'){
                    chars1[i]=100;
                }else if (chars1[i]=='D'){
                    chars1[i]=500;
                }else if (chars1[i]=='M'){
                    chars1[i]=1000;
                }
                if (i>0){
                    if (chars1[i]>chars1[i-1]){
                        res=res-chars1[i-1];
                    }else {
                        res=res+chars1[i-1];
                    }
                }
                if (i==chars1.length-1){
                    res=res+chars1[i];
                }
            }
            return res;
        }
}

