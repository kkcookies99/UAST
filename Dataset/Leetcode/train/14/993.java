 class Solution {
    public String XXX(String[] strs) {
        String min=strs[0];
        for(int i=1;i<strs.length;i++){
            if(strs[i].length()<min.length()){
                min=strs[i];
            }
        }
        int index = min.length();
        for(int i=0;i<strs.length;i++){
            if(strs[i].startsWith(min)) continue; //如果不能用startsWith,
                                                                 //就用 strs[i]substring(0,index).eqauls(min)判断;
                                                  `   //不能用equals和substring的话我也只会暴力了
            while(index!=0){
                 if(strs[i].substring(0,index-1).equals(min.substring(0,index-1))) {
                    min = strs[i].substring(0,index-1);
                    break;
                 }
                 else index--;
                 if(index==0) return "";
            }
        }
        return min;
    }
}

