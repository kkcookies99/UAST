 class Solution {
    public int XXX(String s) {
        if(s == null) return 0;
        //去除前后空格
        char[] ch = s.trim().toCharArray();
        if(ch.length == 0) return 0;
        int flag = ch[0] == '-' ? -1 : 1;//判断是正数还是负数
        boolean zeros = true;//前导0舍弃标志位，当为false时才开始拼接0
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < ch.length ; i++){
            //第一位为符号位
            if(i == 0 && (ch[i] == '+' || ch[i] == '-')) continue;
            //其他不为数字都是非法的，结束遍历
            if(ch[i] < '0' || ch[i] > '9') break;
            //是前导0舍弃
            if (ch[i] == '0' && zeros) continue;
            //拼接数字
            zeros = false;
            sb.append(ch[i]);
            //检验拼接得到的结果是否溢出
            //当为负数时 <= -2147483648 返回-2147483648 当为正数时返回2147483647
            if(Long.parseLong(sb.toString()) > 2147483647) return flag == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return sb.toString().length() == 0 ? 0 : Integer.parseInt(sb.toString()) * flag;
    }
}

