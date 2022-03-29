 public String XXX(String[] strs) {
        StringBuilder str = new StringBuilder();
        //默认第一个长度最小
        int min = strs[0].length();
        for(int i = 1; i < strs.length; i++){
            if(strs[i].length() < min){
                //找到字符串数组中字符的最小长度
                min = strs[i].length();
            }
        }
        for (int i = 0; i < min; i++) {
            char c = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                char c1 = strs[j].charAt(i);
                //依次遍历，逐个比较
                if(c == c1){
                    continue;
                } else {
                    //如有不相等的直接返回
                    return str.toString();
                }
            }
            str.append(c) ;
        }
        return str.toString();
    }

