 public int XXX(String s) {
        Map<Character, Integer> chars = new HashMap<>(16);
        int len = 0, start = 0;
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (chars.containsKey(c)) {
                Integer index = chars.get(c);
                //窗口移动
                if (index >= start) {
                    start = index + 1;
                }
            }
            //每次循环都比较，记录大小
            len = Math.max(len, i - start + 1);
            chars.put(c, i);
        }
        return len;
    }

