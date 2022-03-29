     public int XXX(String s) {
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>(chars.length);
        int max = 0;
        for (int i = 0; i < chars.length; i++){
            for (int j = i; j < chars.length; j++){
                if (!set.add(chars[j])){
                    break;
                }
            }
            if (set.size() > max){
                max = set.size();
            }
            set.clear();
        }
        return max;
    }

