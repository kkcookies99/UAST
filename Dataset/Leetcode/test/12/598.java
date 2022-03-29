 class Solution {
    public String XXX(int num) {
        String[] roman10 = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] roman100 = new String[]{"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] roman1000 = new String[]{"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] roman4000 = new String[]{"M", "MM", "MMM"};
        if (num < 10) {
            return roman10[num - 1];
        }
        if (num >= 10 && num < 100) {
            return roman100[num / 10 - 1] + (num % 10 == 0 ? "" : roman10[num % 10 - 1]);
        }
        if (num >= 100 && num < 1000) {
            return roman1000[num / 100 - 1] + (num % 100 < 10 ? "" : roman100[num % 100 / 10 - 1]) + (num % 10 == 0 ? "" : roman10[num % 10 - 1]);
        }
        if (num >= 1000) {
            return roman4000[num / 1000 - 1] + (num % 1000 < 100 ? "" : roman1000[num % 1000 / 100 - 1]) + (num % 100 < 10 ? "" : roman100[num % 100 / 10 - 1]) + (num % 10 == 0 ? "" : roman10[num % 10 - 1]);
        }
        return "";
    }
}

