 class Solution {
   public static String XXX(String s) {
        String maxStr = s.substring(0,1);
        int length = s.length();
        if(length<=1) return s;
        for (int i = 0; i < length; i++) {
            int left = i;   //左指针
            int right = i+1;    //右指针
            int left1 = i;
            int right1 =i+2;
            while(left>=0&&right<length){
                //两个中心点
                if(s.substring(left,left+1).equals(s.substring(right,right+1))){
                    left--;
                    right++;
                }
                else{
                    break;
                }

            }
            while(left1>=0&&right1<length){
                //一个中心点
                String str = "";
                if(right1==length-1){
                     str =s.substring(right1);
                }
                else str = s.substring(right1,right1+1);
                if(s.substring(left1,left1+1).equals(str)){
                    left1--;
                    right1++;
                }else{
                    break;
                }
            }
            // 判断最大回文子串
            if(left>=0){
                if(right-left-1>maxStr.length()){
                    maxStr = s.substring(left+1,right);
                }
            }else {
                if(right>maxStr.length()){
                    maxStr = s.substring(0,right);
                }
            }
            if(left1>=0){
                if(right1-left1-1>maxStr.length()){
                    maxStr = s.substring(left1+1,right1);
                }
            }else {
                if(right1>maxStr.length()){
                    maxStr = s.substring(0,right1);
                }
            }
        }
        return maxStr;
    }
}

