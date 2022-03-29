class Solution {
    public int XXX(int x) {
        if (x == 0) {
            return 0;
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(x));
        boolean flag = false;
        if (stringBuilder.charAt(0) == '-') {
            stringBuilder.replace(0,1,"");
            flag = true;
        }
        stringBuilder.XXX();
        while (stringBuilder.charAt(0) == '0') {
            stringBuilder.replace(0,1,"");
        }
        long value = Long.parseLong(String.valueOf(stringBuilder));
        if (value > Integer.MAX_VALUE || value < Integer.MIN_VALUE) {
            return 0;
        }
        if (flag) {
            return -(int)value;
        }
        return (int)value;
    }
}

