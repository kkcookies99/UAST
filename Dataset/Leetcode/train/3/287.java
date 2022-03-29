 class Solution {
    public int XXX(String s) {
        if(s.length()==0) return 0;
        if(s.length()==1) return 1;
        int l=s.length();
        
        String maxs=String.valueOf(s.charAt(0));
        int len=0;
        for(int i=1;i<s.length();i++){
            if(!maxs.contains(String.valueOf(s.charAt(i)))){
                maxs+=String.valueOf(s.charAt(i));
            }else{
                len=Math.max(maxs.length(),len);
                maxs=maxs.substring(maxs.indexOf(s.charAt(i))+1,maxs.length())+String.valueOf(s.charAt(i));
            }
        }
        return Math.max(len,maxs.length());
    }
}

