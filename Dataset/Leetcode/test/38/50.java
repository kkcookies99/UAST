    public String XXX(int n) {
        String pre = "1";
        for(int i=1; i<n; i++) {
            StringBuilder temp = new StringBuilder();
            char c = pre.charAt(0);
            int cnt = 1;
            for(int j=1; j<pre.length(); j++) {
                char cc = pre.charAt(j);
                if(c == cc) {
                    cnt++;
                } else {
                    temp.append(cnt).append(c);
                    cnt = 1;
                    c = cc;
                }
            }
            temp.append(cnt).append(c);
            pre = temp.toString();
        }
        return pre;
    }

