 class Solution {
    public int XXX(String s) {
       //如果s为空，length不大于0，是一个空串，就没有向下执行的必要了
        if(s != null && s.length() > 0 && s != ""){
            //String -> char[]
            char[] strChar = s.toCharArray();
            // 存储最长字串 key:char值，value:index下标
            ArrayList<String> maxStr = new ArrayList<>();
            //临时的字串存储空间
            ArrayList<String> tempStr = new ArrayList<>();
            //循环
            for(int i=0; i<strChar.length; i++){
                //char -> String
                String str = new String(new char[]{strChar[i]});
                //判断str是否存在于tempStr中
                if(tempStr.contains(str)){
                    //先判断tempStr的长度是否大于等于maxStr的长度,大于，才能将最长字串覆盖
                    if(tempStr.size() > maxStr.size()){
                        maxStr = new ArrayList<>(tempStr);
                    }
                    //存储重复字符
                    int reIndex = tempStr.indexOf(str);
                    // 删除tempStr中的重复字节及其之前的字符
                    for(int j=0;j<=reIndex;j++){
                        tempStr.remove(0);
                    }
                }
                //将当前字符存入tempStr中
                tempStr.add(str);
            }
            //最终判断
            if(tempStr.size() > maxStr.size()){
                maxStr = tempStr;
            }
            //返回最长字串的长度
            return maxStr.size();
        }
        return 0;
    }
}

