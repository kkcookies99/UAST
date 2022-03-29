 class Solution {
    public String XXX(String[] strs) {
        if(strs.length==0||strs[0].length()==0) return ""; 
        if(strs.length==1) return strs[0];
        boolean flag=false;
        String res="";
        for(int i=0;i<strs[0].length();i++){
            for(int j=1;j<strs.length;j++){
                if(strs[j].length()==i||strs[j].charAt(i)!=strs[0].charAt(i)){
                    flag=true;
                    break;
                }
            }
            if(flag){
                break;
            }else{
                res+=strs[0].charAt(i);
            }
        }
        return res;
    }
}

