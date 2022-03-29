 public String XXX(String[] strs) {
        int minN = Integer.MAX_VALUE, commonN = 0;
        if (strs.length == 1)return strs[0];
        for (int i = 0; i < strs.length; i ++){
            minN = Integer.min(minN, strs[i].length());
        }
        if (minN == 0)return "";
        boolean flag = false;
        for (int n = 0; n < minN; n ++){
            for (int index = 1; index < strs.length; index++) {
                if (strs[index].charAt(n) != strs[0].charAt(n)){
                    flag = true;
                    break;
                }
            }
            if (flag == true){
                commonN = n;
                break;
            }
            commonN ++;
        }
        return strs[0].substring(0, commonN);
    }

