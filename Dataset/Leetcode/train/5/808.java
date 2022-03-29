 class Solution {
    public String XXX(String s) {
        int strLength = s.length();
        if(strLength < 2){
            return s;
        }

        int maxLength = 1; // 最大回文长度
        int begin = 0; // 初始索引
        boolean[][] table = new boolean[strLength][strLength];// 动态规划状态表
        // 设置表中对角线元素每一项都为true，也就是每一个单个元素都为true，也就是递归的出口
        for(int i = 0; i < strLength; i++){
            table[i][i] = true;
        }

        char[] charArr = s.toCharArray();
        // 最长回文子串长度不断变化
        for(int tempLength = 2; tempLength <= strLength; tempLength++){
            // 定义左边界下标left
            for(int left = 0; left <strLength; left++){
                // 定义右边界left
                int right = left + tempLength - 1;
                if(right >= strLength){
                    // 右数组越界
                    break;
                }

                if(charArr[left] != charArr[right]){
                    table[left][right] = false;
                }else{
                    if(right - left < 3){
                    // 如果字符串的长度小于3，那么这个字符串就不需要查询规划表
                    table[left][right] = true;
                }else{
                    table[left][right] = table[left + 1][right - 1]; 
                }
            }
            // 每次改变tempLength前都需要对回文串的最大长度（maxLength）进行判断并跟新;
            if(table[left][right] && right - left + 1 > maxLength){
                maxLength = right - left + 1;
                begin = left;
                }
            } 
        }
        return s.substring(begin, maxLength + begin);  
    }
}

