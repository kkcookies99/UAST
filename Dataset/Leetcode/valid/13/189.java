    public int XXX(String s) {
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] reps = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int num = 0;
        while (!s.isEmpty()) {
            for (int i = 0; i < reps.length; i++) {
                if (s.startsWith(reps[i])) {
                    num += nums[i];
                    s = s.substring(reps[i].length());
                }
            }
        }
        return num;
    }

