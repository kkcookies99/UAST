 class Solution {
    public String XXX(String[] strs) {
        int minLength = 200;
        for(int i = 0;i<strs.length;i++){
            minLength = Math.min(strs[i].length(),minLength);
        }
        return onSplit(strs,minLength);
    }
    public String onSplit(String[] strs,int length){
        Set set = new HashSet();
        if(length==0){
            return "";
        }
        for(int i=0;i<strs.length;i++){
            strs[i] = strs[i].substring(0,length);
        }
        for(int i =0;i<strs.length;i++){
            set.add(strs[i]);
        }
        if(set.size!=1){
            return onSplit(strs,length-1);
        }else{
            return strs[0];
        }
    }
}

