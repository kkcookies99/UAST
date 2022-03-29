     public int XXX(String s) {
        char[] roman = new char[]{'M', 'D', 'C', 'L', 'X', 'V', 'I'};
        int[] value = new int[]{1000, 500, 100, 50, 10, 5, 1};

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < roman.length; i++) {
            map.put(roman[i], value[i]);
        }

        int ans = 0; char last = 0;
        for (char c:s.toCharArray()) {
            if (last != 0 && map.get(last) < map.get(c)) ans = ans + map.get(c) - 2 * map.get(last);
            else ans += map.get(c);
            last = c;
        }

        return ans;
    }

