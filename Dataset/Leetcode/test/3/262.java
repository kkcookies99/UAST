  public int XXX(String s) {
        char[] cs = s.toCharArray();
        // start：为重复元素的下一个元素的下标 + 1
        int max = 0, start = 0;
        // key:字符   value:字符的下标
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < cs.length; i++) {
            if(map.containsKey(cs[i]) && map.get(cs[i]) >= start){
                Integer preIndex = map.get(cs[i]);
                max = Math.max(max, i - start);
                start = preIndex + 1;
            }
            map.put(cs[i], i);
        }
        // 最后一次如果没有遇到重复的字符，需要计算
        max = Math.max(max, cs.length - start);
        return max;
  }

