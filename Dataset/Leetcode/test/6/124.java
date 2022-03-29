 class Solution {
    public String XXX(String s, int numRows) {
        if(s==null||numRows<=1||s.length()<=numRows) return s;
        int divsor=numRows*2-2;                             //字符间隔
        int STRLEN=s.length();
        char[] words=new char[STRLEN];
        int p=0;
        for(int i=0;i<STRLEN;i=i+divsor){                   //第一行
            words[p++]=s.charAt(i);
        }
        for (int i = 0; i < numRows - 2; i++) {             //中间各行
            for(int j=i+1,k=divsor-(i+1);j<STRLEN;j=j+divsor,k=k+divsor){
                //中间各行都是在一个周期（T=divsor）内插入两个字符
                words[p++]=s.charAt(j);
                if(k<STRLEN) words[p++]=s.charAt(k);
            }
        }
        for(int i=numRows-1;i<STRLEN;i=i+divsor){           //最后一行
            words[p++]=s.charAt(i);
        }
        return String.copyValueOf(words);
    }
}

