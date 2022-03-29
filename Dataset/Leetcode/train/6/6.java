 public String XXX(String s, int numRows) {
        //当s的长度小于行数时，直接返回s
        //当行数为1时，也直接返回s
        if (s.length() < numRows || numRows == 1){
            return s;
        }
        int segment = 2 * numRows - 2;
        StringBuilder target = new StringBuilder(s.length());
        // 输出头
        for (int i = 0; i * segment < s.length(); i++){
            target.append(s.charAt(i * segment));
        }
        // 输出体
        for (int i = 0; i < numRows - 2; i++){
            for (int j = 0; j * segment  + i + 1 < s.length(); j++ ){
                // 输出一段的第一列
                target.append(s.charAt(j * segment + i + 1));
                // 输出一段的第二列，首先要判断第二列对应位置是否有元素，也就是索引不能超过s的长度
                if (j * segment + (segment - i - 1) < s.length()){
                    target.append(s.charAt(j * segment + (segment - i - 1)));
                }
            }
        }
        // 输出尾
        for (int i = 0; i * segment + numRows - 1 < s.length(); i++){
            target.append(s.charAt(i * segment + numRows - 1));
        }
        return target.toString();
    }

