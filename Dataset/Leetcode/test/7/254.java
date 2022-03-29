public int XXX(int x) {
        boolean minus = false;
        if(x < 0) {
            minus = true;
        }
        String num = minus ? String.valueOf(x).substring(1) : String.valueOf(x);
        StringBuffer buffer = new StringBuffer();
        for(int i=num.length() - 1; i>= 0; i--) {
            buffer.append(num.charAt(i));
        }
        num = buffer.toString();
        num = minus ? "-" + num : num;
        int ret = 0;
        try {
            ret = Integer.valueOf(num);
        } catch (NumberFormatException e) {
            
        }
        return ret;
    }

