 class Solution {
    public int XXX(String s) {
        // 1、先把前导空格给去掉
        s = s.trim();
        // 2、对去掉空格后的字符串进行判空操作
        if(s.length() < 1){
            return 0;
        }
        // 3、创建一个sb作为数字字符的连接
        StringBuilder sb = new StringBuilder("");
        // 4、对s进行遍历的下标一开始i = 0
        int i = 0;
        // 5、flag是记录这个数的正负情况
        boolean flag = true;  // 默认这个是正数
        // 6、先处理s的第一个字符是不是存在正负号
        if(s.charAt(0) == '-'){
            flag = false;
            i++;
        }
        if(s.charAt(0) == '+'){
            i++;
        }
        
        // 7、处理完正负号之后就开始遍历s剩下的部分
        for( ; i < s.length(); i++){
            // 如果i指向了非数字的字符，直接break截断之后的字符
            if(s.charAt(i) < '0' || s.charAt(i) > '9' ){ 
                break;
            }
            sb.append(s.charAt(i));
        }

        // 此时 这个 sb 只有数字组成
        long result = 0;
        // 8、开始遍历这个只有数字组成是sb，把它转换成int数字
        for(int j = 0; j < sb.length(); j++){
            result = result*10 + sb.charAt(j) - '0'; // 把字符串转成数字，这个步骤可能会产生溢出，所以下面要判断
            
            // 转换成数字之后，判断result是否越了整数的界
            if(result > Integer.MAX_VALUE ){
                return flag ? Integer.MAX_VALUE : -Integer.MAX_VALUE-1;
            }
        }

        // 9、执行到这说明没有越界
        if(flag == false){ // 如果不是正数 就加个负号再返回
            result = -result;
        }

        return (int)result;

    }
}

