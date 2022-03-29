public int XXX(int x) {  
        //思路1：把整数转为字符串
        long y = x >=0 ? x : x*(-1l);
        long i = Long.valueOf(new StringBuffer(String.valueOf(y)).XXX().toString());
        return (Integer.MAX_VALUE >= i && i >= Integer.MIN_VALUE) ? (x > 0 ? (int)i : (int)i*(-1)) : 0;
    }
}

