 class Solution {
    public String XXX(String s) {  //马拉车算法
        if(s == null || s.length()<1){return "";}  //特殊情况不要忘记
        String newStr = manacherStr(s);   //新字符串
        int rightIndex = -1;     //最右边界指针
        int centerIndex = -1;    //中心指针
        int start = 0;          //开头指针，为了最后截取最长回文子串
        int end = 0;            //末尾指针
        int maxLen = Integer.MIN_VALUE;   //最长回文子串长度
        int radius[] = new int[newStr.length()];  //存放每个以i为中心点的回文半径的数组
        for(int i = 0 ; i < newStr.length();i++){
            radius[i] = rightIndex > i ? Math.min(radius[2*centerIndex - i],rightIndex - i + 1) : 1 ;
            while(i - radius[i] > -1 && i + radius[i] < newStr.length()){  //中心扩展
                if(newStr.charAt(i - radius[i]) == newStr.charAt(i + radius[i])){
                    radius[i]++; //增大回文半径的数值
                }else{
                    break;
                }
            }
            if(i + radius[i] > rightIndex){ //最右边界太小的时候，增大最右边界和更新中心点
                rightIndex = i + radius[i] - 1;
                centerIndex = i ;
            }
            if(radius[i] > maxLen){  
                maxLen = radius[i];   //更新最长回文子串长度
                end = (rightIndex - 1)/2;   //记录最长回文子串的开头和末尾（注意是字符串s的坐标）
                start = end - (maxLen -1) + 1;
            }
        }
        return s.substring(start,end+1);
    }
    public String manacherStr(String s){  //把字符串转换成插入了 # 的新字符串
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < s.length();i++){
            sb.append('#');
            sb.append(s.charAt(i));
        }
        sb.append('#');     //最后别忘了末尾加上#
            return sb.toString();  //返回一个新的字符串
    }

}


