 class Solution {
    public int XXX(String s) {
        char[] ca=s.toCharArray();
        int num=0;
        for(int i=ca.length-1;i>=0;i--){
            if(ca[i]==' '){
                if(num>0)break;
                else continue;
            }else{
                num++;
            }
        }
        return num;
    }
}

