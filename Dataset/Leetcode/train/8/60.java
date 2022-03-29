class Solution {
    public int XXX(String s) {
        s = s.trim();//如果去掉首尾空格后，长度为0，则直接返回
        if (s.length() == 0) {
            return 0;
        }
        char[] chars = s.toCharArray();
        StringBuffer ss = new StringBuffer(chars.length);
        boolean flag = false;
        if (chars[0] == '-') {//flag为flase，最后结果为负，flag为true，最后结果为正
            flag = false;
        } else if (chars[0] == '+') {
            flag = true;
        } else if (Character.isDigit(chars[0])){//如果首位字符为数值，则加入字符串
            flag = true;
            ss.append(chars[0]);
        }else{//进行首位字符的判断，如果不符合规范，则直接返回
            return 0;
        }
        for (int size = 1; size < chars.length; size++) {//循环向字符串中插入字符，直到不符合需求为止
            if (!Character.isDigit(chars[size])){
                break;
            }
            String s1 = ss.toString().length() == 0 ? "0" : ss.toString();
            if (Integer.parseInt(s1) > (Integer.MAX_VALUE - (chars[size] - '0')) / 10) {
                return flag ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ss.append(chars[size]);
        }
        if(ss.length() == 0){
            return 0;
        }
        return flag ? Integer.parseInt(ss.toString()) : -Integer.parseInt(ss.toString());
    }
}

