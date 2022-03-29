public String XXX(int n) {
        String last = "1";
        for(int i=2; i<=n; i++){
            char cur = last.charAt(0);
            int cnt = 1;
            StringBuilder builder = new StringBuilder();
            for(int j=1; j<last.length(); j++){
                if(last.charAt(j) != cur){
                    builder.append(cnt).append(cur);
                    cur = last.charAt(j);
                    cnt = 1;
                }else{
                    cnt++;
                }
            }
            builder.append(cnt).append(cur);
            last = builder.toString();
        }
        return last;
    }

