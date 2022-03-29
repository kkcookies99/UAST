 class Solution {
    public String XXX(String[] strs) {
        int len = strs.length;
         //空字符串或长度为1，直接返回
        if(len<1){
            return "";
        }else if(len==1){
            return strs[0];
        }
        //找到最短的字符串长度
        int min =200;
        for(int i =0;i<len;i++){
            if(strs[i].length()<min){
                min=strs[i].length();
            }
        }

        //遍历最短的字符串长度
        for(int i = 0;i < min ;i++){
            String temp = strs[0].substring(i,i+1);
            //依次比较所有字符串的第i个字符，相等继续，有一个不等，即退出
            int j;
            for(j =1;j<len;j++){
                if(!temp.equals(strs[j].substring(i,i+1))){
                    break;
                }

            }
            if(j<len){
                return strs[0].substring(0,i);
            }
        }
        return strs[0].substring(0,min);
    }
}

