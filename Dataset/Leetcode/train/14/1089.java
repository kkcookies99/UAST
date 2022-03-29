 class Solution {
    public String XXX(String[] strs) {

        if(strs == null || strs.length == 0){
            return "";
        }

        if(strs.length == 1){
            return strs[0];
        }

        char[] chars = strs[0].toCharArray();

        //首先尝试第0位
        int index = 0;

        while(index < chars.length){
            //从第strs[i]个字符串开始检查
            for(int i=1;i<strs.length;i++){
                String s = strs[i];
                //如果要尝试的位置比 s 的长度还要大，说明不可能，直接退出循环
                if(s.length() <= index){
                    if(index == 0){
                        return "";
                    }
                    return strs[0].substring(0,index);
                }
                //检查
                if(s.charAt(index) == chars[index]){
                    //如果是最后一个字符串，则说明已经检查通过
                    if(i == strs.length-1){
                        //尝试比较下一位
                        index++;
                    }
                }else{
                    if(index == 0){
                        return "";
                    }
                    return strs[0].substring(0,index);
                }
            }
        }
        if(index == 0){
            return "";
        }
        return strs[0];
    }
}

