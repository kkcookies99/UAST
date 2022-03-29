 class Solution {
    public String XXX(String[] strs) {
 if(strs==null){
            return "";
        }else if(strs.length==1){
            return strs[0];
        }
        int val=strs[0].length();
        int flag=1;
        for(int i=0;i<val;i++){
            String temp=strs[0].substring(0,val-i);
            for(int j=1;j<strs.length;j++){
                if( strs[j].length()>=val-i&&strs[j].substring(0,val-i).equals(temp)){
                    flag=1;
                    continue;
                }else{
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                return temp;
            }

        }
        return "";
    }
}

