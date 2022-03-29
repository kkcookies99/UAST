 public String XXX(String[] strs) {
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];
        char[] chars = strs[0].toCharArray();
        int max = chars.length;
        for(String s: strs){
            max = Math.min(max, s.length());
            for(int i=0;i<max;i++){
                if(s.charAt(i) != chars[i]){
                    max = i;
                }   
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<max;i++){
            sb.append(chars[i]);
        }
        return sb.toString();
    }

