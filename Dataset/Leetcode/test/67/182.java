     public String XXX(String a, String b) {
        if("0".equals(a)) return b;
        if("0".equals(b)) return a;
        int la = a.length(), lb = b.length(), lm = Math.max(la,lb);
        StringBuilder aBuilder = new StringBuilder(a);
        for(int i = la; i < lm; i++) aBuilder.insert(0, "0");
        a = aBuilder.reverse().toString();
        StringBuilder bBuilder = new StringBuilder(b);
        for(int i = lb; i < lm; i++) bBuilder.insert(0, "0");
        b = bBuilder.reverse().toString();
        StringBuilder res = new StringBuilder();
        int record = 0, count = 0;
        for(int i = 0; i < lm; i++) {
            count = 0;
            if(b.charAt(i) == '1') count++;
            if(a.charAt(i) == '1') count++;
            count+=record;
            if(count%2==0) res.append('0');
            else res.append('1');
            if(count>=2) record = 1;
            else record = 0;
        }
        if(record>0) res.append('1');
        return res.reverse().toString();
    }

