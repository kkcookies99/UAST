 class Solution {
    public String XXX(String[] strs) {

        if(strs.length==0){
            return "";
        }

        // 第一个字符串当模板串
        String firstString = strs[0];

        // 模板串的字符，逐个测试
        for(int i=0; i<firstString.length(); i++){
            
            char tmpStr = firstString.charAt(i);
            for(int j=1; j<strs.length; j++){
                if(i>(strs[j].length()-1) || tmpStr!=strs[j].charAt(i) ){
                    return new String(firstString.substring(0,i));
                }
            }
        }

        return firstString;
    }
}

