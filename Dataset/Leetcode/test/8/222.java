class Solution {
    public int XXX(String s) {
        if (s == null || s.length() == 0) return 0;
        ///读入字符串并丢弃无用的前导空格
        while (0 < s.length() && s.charAt(0) == ' ') s = s.trim();
        //检查下一个字符（假设还未到字符末尾）为正还是负号，读取该字符（如果有）。
        // 确定最终结果是负数还是正数。 如果两者都不存在，则假定结果为正。
        boolean negFlag = false;
        int index = 0;//字符串开始读
        String str = "";
        if (0 < s.length() && s.charAt(0) == '-') {
            negFlag = true;
            index = 1;//跳过
        }else if (0 < s.length() && s.charAt(0) == '+') index = 1;//跳过
        while (index != s.length() && s.charAt(index) >= '0' && s.charAt(index) <= '9') str += s.charAt(index++);
        if (str == "") return 0;

        //读入下一个字符，直到到达下一个非数字字符或到达输入的结尾。字符串的其余部分将被忽略。
        //将前面步骤读入的这些数字转换为整数（即，"123" -> 123， "0032" -> 32）。如果没有读入数字，则整数为 0 。
        // 必要时更改符号（从步骤 2 开始）。
        long n;
        try {
            n = Long.valueOf(str);
        }catch (Exception e){
            return negFlag ? (int)(-Math.pow(2, 31)) : (int)(Math.pow(2, 31) - 1);
        }
        if ((int) n == n) return negFlag ? -(int)n : (int)n;
        //如果整数数超过 32 位有符号整数范围 [−231, 231− 1] ，需要截断这个整数，使其保持在这个范围内。
        // 具体来说，小于 −231 的整数应该被固定为 −231 ，大于 231 − 1 的整数应该被固定为 231 − 1 。
        //返回整数作为最终结果。
        return negFlag ? (int)(-Math.pow(2, 31)) : (int)(Math.pow(2, 31) - 1);
    }
}

