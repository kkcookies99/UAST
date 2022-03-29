     public String XXX(String[] strs) {
        if (!(strs.length > 0))
            return "";
        
        int min = strs[0].length();     
        int index;
        
        // 得到最小的字符串字符数
        for (int i = 0; i < strs.length; i++) {
            min = min < strs[i].length() ? min : strs[i].length();
        }

        // 外循环控制字符数, 内循环控制 strs 数组
        for (index = 0; index < min; index++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(index) != strs[j-1].charAt(index)) {
                    return index == 0 ? "" : strs[j].substring(0, index);
                }
            }
        }

        return strs[0].substring(0, index);
    }


