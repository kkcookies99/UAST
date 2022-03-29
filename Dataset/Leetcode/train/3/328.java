  public int XXX(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0, max = 0;
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            //如果当前元素与滑动窗口中的元素重复：
            if(map.containsKey(c) && map.get(c) >= start) {
                max = Math.max(max, i - start); 
                start = map.get(c) + 1;  
            //如果当前元素与滑动窗口中的元素不重复，但已经遍历到了最后一个字符：
            }else if(i == s.length() - 1) max = Math.max(max, i - start + 1); 
            map.put(c, i);
        } 
        return max;
    }

