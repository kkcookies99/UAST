 class Solution {
    public String XXX(int num) {
        String ans;
        String[] roma1 = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] roma2 = new String[]{"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] roma3 = new String[]{"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        // 个位数
        int i = num % 10;
        if (i == 0) ans = "";
        else ans = roma1[i - 1];
        // 十位数
        int j = num / 10 % 10;
        if (j != 0)
            ans = roma2[j - 1] + ans;
        // 百位数
        int k = num / 100 % 10;
        if (k != 0)
            ans = roma3[k - 1] + ans;
        // 千位数
        int l = num / 1000 % 10;
        if (l != 0)
            for (int m = 0; m < l; m++) {
                ans = "M" + ans;
            }
        return ans;
    }
}

