     public int XXX(String s) {
        // 字符上次出现的位置
        Map<Character, Integer> charLastPos = new HashMap<Character, Integer>();
        int start = -1; // 子串起始位置为start+1
        int maxLen = 0; // 最长子串长度
        int len = s.length(); // 记录字符串长度，避免for循环多次都调用函数
        for (int i = 0; i < len; i++) {
            Character cur = s.charAt(i);
            if (charLastPos.containsKey(cur)) {
                // 当前字符上一次出现的位置
                int lastPos = charLastPos.get(cur);
                // 出现重复字符时，比较字符上次出现的位置与当前子串start大小
                // 若小于start，说明不在当前子串里，start不变
                // 若大于start，说明在当前子串里，把start更新到字符上次出现的位置
                if (lastPos > start) {
                    start = lastPos;
                }
            }
            // 子串其实是从start+1位置开始
            // 子串长度计算公式为：i-(start+1)+1，简化为i-start
            int curLen = i - start;
            if (curLen > maxLen) {
                maxLen = curLen;
            }
            charLastPos.put(s.charAt(i), i);
        }
        return maxLen;
    }

