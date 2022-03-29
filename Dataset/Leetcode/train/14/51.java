 public String XXX(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        String res = strs[0];
        int i = 1;
        while (i<strs.length){
            while (strs[i].indexOf(res) != 0) {
                res = res.substring(0, res.length() - 1);
            }
            i += 1;
        }
        return res;
    }

