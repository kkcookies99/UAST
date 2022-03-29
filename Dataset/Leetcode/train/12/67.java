 class Solution {

    public String XXX(int num) {
        StringBuilder builder = new StringBuilder();
        num = appendRoman(num, 1000, "M", builder);
        num = appendRoman(num, 900, "CM", builder);
        num = appendRoman(num, 500, "D", builder);
        num = appendRoman(num, 400, "CD", builder);
        num = appendRoman(num, 100, "C", builder);
        num = appendRoman(num, 90, "XC", builder);
        num = appendRoman(num, 50, "L", builder);
        num = appendRoman(num, 40, "XL", builder);
        num = appendRoman(num, 10, "X", builder);
        num = appendRoman(num, 9, "IX", builder);
        num = appendRoman(num, 5, "V", builder);
        num = appendRoman(num, 4, "IV", builder);
        num = appendRoman(num, 1, "I", builder);
        return builder.toString();
    }

    private int appendRoman(int num, int minus, String append, StringBuilder builder) {
        while(num >= minus) {
            builder.append(append);
            num -= minus;
        }
        return num;
    }
}

