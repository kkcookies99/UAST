 public boolean XXX(int x) {
        //小于0 和 末尾为0 不可能为回文数，直接返false   
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        //0~9直接返true
        if(x < 10 && x >= 0){
            return true;
        }
        int result = 0;
        while (x != 0) {
            //防溢出
            if (result < Integer.MIN_VALUE / 10 || result > Integer.MAX_VALUE / 10) {
                return false;
            }
            result = result * 10 + x % 10;
            //result是从尾到头，x是从头到尾，在中间相等时就说明一致（类比镜子），/10是因为有奇偶数的情况
            //也可算出x翻转后的结果后再比较，逻辑与7.整数反转一样，但理想状态只用循环一半
            if (result == x || result == x / 10) {
                return true;
            }
            x /= 10;
        }
        return false;
    }

