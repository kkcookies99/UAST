 class Solution {
    public String XXX(String[] strs) {
        if(strs == null||strs.length==0){
            return "";
        }
        char[] chars = strs[0].toCharArray();
        String min = "";
        boolean flag = false;
        for(int i =0 ;i< chars.length ;i++){

            for(int j=1;j<strs.length;j++){
                char[] temp = strs[j].toCharArray();
                if(i>temp.length-1){
                    flag =true;
                    break;
                }
                if(chars[i]!= temp[i]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                min = min + String.valueOf(chars[i]);
            }else{
                break;
            }

        }
        return min;
    }
}

