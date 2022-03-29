 public static int XXX(String s) {
        HashSet<Character> set = new HashSet<>();
        int len = s.length(), max = 0, l = 0;
        for (int i = 0; i < len; i++) {
            while (l < len && !set.contains(s.charAt(l))) {
                set.add(s.charAt(l));
                l++;
            }
            max = Math.max(max, l - i);
            set.remove(s.charAt(i));
        }
        return max;
    }

