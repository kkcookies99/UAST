 public String XXX(String[] strs) {
        String str = strs[0];
        for (int j = str.length(); j > 0; j--) {
            String prefix = str.substring(0,j);
            int tmp = 0;
            for (int i = 0; i < strs.length; i++) {
                if(strs[i].startsWith(prefix)){
                    tmp ++;
                }
            }
            if(tmp==strs.length){
                return prefix;
            }
        }
        return "";
    }```

