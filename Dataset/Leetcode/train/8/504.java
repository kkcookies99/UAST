 class Solution {
    public static int XXX(String s) {
        StringBuilder ret = new StringBuilder();
        long res = 0L;//记录数字
        int flag = 0;//记录符号
        for (int i = 0; i < s.length();) {
            //去除开头的空格
            while (i < s.length() && s.charAt(i) == ' ') {
                i ++;
            }

            //去除开头的空格后，第一位只能是正负号或者数字，其它形式结果都是0
            if (i < s.length() && ret.length() == 0 && flag == 0){
                if (s.charAt(i) == '+') {
                    flag = 1;i ++;
                } else if (s.charAt(i) > '0' && s.charAt(i) <= '9') {
                    ret.append(s.charAt(i));i ++;
                } else if (s.charAt(i) == '0') {
                    i ++;
                } else if (s.charAt(i) == '-') {
                    flag = -1;i ++;
                } else {
                    return 0;
                }
            }

            //若还没有1-9的数字，则开头的0应该全部去掉
            if (ret.length() == 0){
                while (i < s.length() && s.charAt(i) == '0'){
                    i ++;
                }
            }

            //现在开始加入正式的数字
            while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                ret.append(s.charAt(i));
                i ++;
            }

            //加入数字停止，后面也不用管了
            break;
        }

        //没有+，默认正数
        if (flag != -1){
            flag = 1;
        }

        //数字位数超过一定值，肯定整形溢出
        if (ret.length() > 12 && flag == 1){
            return Integer.MAX_VALUE;
        }else if (ret.length() > 11 && flag == -1){
            return Integer.MIN_VALUE;
        }

        //现在基本只能是整形数字了，字符串转成数字
        String a;
        a = ret.toString();
        long b = 1L;
        for (int i = a.length() - 1; i >= 0; i --){
            res += (a.charAt(i) - '0') * b;
            b *= 10;
        }

        //加上符号
        res = res * flag;

        //如果还是超了整形范围
        if (res <= Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        if (res >= Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }

        //没超的结果
        return (int)res;
    }

    public static void main(String[] args) {
        //LeetCode上面奇怪的测试用例
        System.out.println(XXX("+-56"));
        System.out.println(XXX("00000-42a1234"));
        System.out.println(XXX("+1"));
        System.out.println(XXX("3.1415"));
        System.out.println(XXX("words and 987"));
        System.out.println(XXX("4193gh56"));
        System.out.println(XXX("-+5"));
        System.out.println(XXX("    -42"));
        System.out.println(XXX("-000000000000000000000000001"));
        System.out.println(XXX(" "));
    }
}

