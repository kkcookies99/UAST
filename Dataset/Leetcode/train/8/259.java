class Solution {
    public int XXX(String s) {
        long res=0;
        byte fh=0,fz=0;
        for(int i=0;i<s.length();i++){
            char n=s.charAt(i);
            if(n>47&&n<58){
                res=res*10+n-48;
                fz=1;
                if(res>=Integer.MAX_VALUE) break;
            }else if(fz==0&&fh==0){
                if(n==32){
                    continue;
                }else if(n==45){
                    fh=-1;
                }else if(n==43){
                    fh=1;
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        res*=fh==-1?fh:1;
        return res>Integer.MAX_VALUE?Integer.MAX_VALUE:res<Integer.MIN_VALUE?Integer.MIN_VALUE:(int)res;
    }
}

