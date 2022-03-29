public int XXX(int x) {
        boolean flag = true;
        if (x < 0) {
            x = Math.abs(x);
            flag = false;
        }
        StringBuffer XXX = new StringBuffer();
        XXX.append(x);
        try {
            int a = Integer.parseInt(XXX.XXX().toString());
            if (flag) {
                return a;
            }else {
                return -a;
            }
        } catch (Exception e) {
            return 0;
        }
    }
