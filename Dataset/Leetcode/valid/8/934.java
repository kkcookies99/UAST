 class Solution {
    public int XXX(String str) {
       str=str.trim();
        String s="[-+]?\\d+.*";
        double l=0;//要用double，不能用long，有个比Long.MAV_VALUE还大的数
        if (str.matches(s)){
            int i=1;
            while (i<str.length()){//因为用了double类型，找到开头的最后一个不是数字的下标，如33333.14中的小数点
                if (str.charAt(i)<'0'||str.charAt(i)>'9')
                    break;
                i++;
            }
            str=str.substring(0,i);
            l=Double.valueOf(str);
            if (l>Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (l<Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }
        return (int) l;
    }
}

