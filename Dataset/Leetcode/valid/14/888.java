 class Solution {
    public String XXX(String[] strs) {

        if(strs.length==0||strs.length==1){
            return strs[0];
        }
        //先取出最小长度的字符串,先假设第一个就是最小的
        int minLength=strs[0].length();
        int minIndex=0;
        for(int i=1;i<strs.length;i++){
           if(strs[i].length()<minLength){
                minLength=strs[i].length();
               minIndex=i;
            }
        }
        //if(minLength==0){
            //return "";
        //}
        //return minLength;找到了最小的长度
        int length=0;
        for(int i=0;i<minLength;i++){
            for(int j=0;j<strs.length;j++){
                //把最短的字符串作为基准拿来比较,并且只需要比较最小长度的那么长
                char c=strs[minIndex].charAt(i);
                if(c==strs[j].charAt(i)){
                    length++;
                }else {
                    return strs[minIndex].substring(0,length/strs.length);
                }
            }
        }
        return strs[minIndex].substring(0,length/strs.length);
    }
    
}

