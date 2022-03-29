 class Solution {
    private int[] numbers =  { 1,  4,     5,   9,  10,  40,    50,  90,    100, 400,  500, 900, 1000};
    private String[] roman = {"I", "IV", "V", "IX","X", "XL", "L",  "XC", "C",  "CD", "D",  "CM", "M" };

    private int binarySearch(int target) {
        int l = 0, r = numbers.length-1;
        while (l <= r) {
            int m = l + (r-l)/2;
            if( numbers[m] == target) return m;
            else if(numbers[m] > target) r = m-1;
            else l = m+1;
        }
        return Math.max(r, 0);
    }

    public String XXX(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int idx = binarySearch(num);
            sb.append(roman[idx]);
            num -= numbers[idx];
        }
        return sb.toString();
    }

}

