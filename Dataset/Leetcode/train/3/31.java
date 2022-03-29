 public int XXX(String s) {
        // 滑动窗口解法
        // 用一个hashMap来判断重复值 key -> value 结构组成 -> [索引位的字符,索引+1]
        Map<Character, Integer> map = new HashMap<>();
        // 记录字符串长度的最大值
        int maxLength = 0;
        // 滑动窗口的左指针
        int left = 0;
        // 滑动窗口的右指针
        int right;
        for (right = 0; right < s.length(); right++) {
            // 获取第一个字符
            Character c = s.charAt(right);
            // 判断这个字符是否在map里面
            if (map.containsKey(c)) {
                // 如果出现重复，需要更改做指针为重复位置的下一位, 而这个下一位是在map中做的处理
                // 需要取一下最大值,防止最后一个元素，与第一个元素出现重复情况 "pwwkewp" 其实本质是出现这种情况下保持left指针不变
                left = Math.max(map.get(c), left);
            }
            // 更新最长字串的长度
            // 为什么取最大值，因为要的就是最大字串的长度，之前记录的如果最大，那还是要最大的 如 "pwwkew" 最大字串可能是 wke kew 所以字串不是固定的
            // 为什么是 right - left + 1
            // right - left 是计算这个字串的长度
            // + 1 因为计算时用的是数组索引，实际结果要的是元素个数 5 - 4 = 1 但是 位置 4,5 的元素都算 应该是 2个
            maxLength = Math.max(maxLength, (right - left + 1));
            // 加入到map里面
            // 为什么 value 是 right + 1
            // 因为滑动窗口的概念
            // 遇到重复的元素了，那么其实位置需要指向重复元素位置的下一位，为了改变left指针做准备
            map.put(c, right + 1);
        }
        return maxLength;   
    }

