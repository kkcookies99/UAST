 public boolean XXX(int x) {
        if (x < 0) {
            return false;
        }

        //操作字符串
        String str = x + "";
        String restr = ""; //反转

        for (int i = str.length() - 1; i >= 0; i--) {
            restr += str.charAt(i) + "";
        }

        if (str.equals(restr)) {
            return true;
        }
        return false;
    }

