 class Solution {
    public int XXX(String s) {
        int res=0;
        char[] ch=s.toCharArray();
        int isw=0;
        for(int i=ch.length-1;i>0;i--){
            isw=ch[i]==' '?0:1;
            res+=isw;
            if(isw==1&&ch[i-1]==' '){
                return res;
            }
            
        }
        return ++res;
    }
}```
