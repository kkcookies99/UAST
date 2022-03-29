     public String XXX(int num) {
        String[] roman = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV","I"};
        String ans = "";
        int[] value = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        for (int i = 0; i < value.length; i++) {
            int count = num / value[i];
            for (int j = 0; j < count; j++) ans += roman[i];
            num %= value[i];
        }

        return ans;
    }

