 class Solution {
    public String XXX(int num) {

        StringBuilder stringBuilder = new StringBuilder();
        int thousands = num / 1000;
        int hundreds = num % 1000 / 100;
        int ten = num % 100 / 10;
        int one = num % 10;
        for (int i = 0; i < thousands; i++) {
            stringBuilder.append('M');
        }
        if (hundreds == 9) {
            stringBuilder.append("CM");
        } else if (hundreds == 4) {
            stringBuilder.append("CD");
        } else {
            int i = 0;
            if (hundreds >= 5) {
                stringBuilder.append('D');
                i = 5;
            }
            for (; i < hundreds; i++) {
                stringBuilder.append('C');
            }
        }

        if (ten == 9) {
            stringBuilder.append("XC");
        } else if (ten == 4) {
            stringBuilder.append("XL");
        } else {
            int i = 0;
            if (ten >= 5) {
                stringBuilder.append('L');
                i = 5;
            }
            for (; i < ten; i++) {
                stringBuilder.append('X');
            }
        }

        if (one == 9) {
            stringBuilder.append("IX");
        } else if (one == 4) {
            stringBuilder.append("IV");
        } else {
            int i = 0;
            if (one >= 5) {
                stringBuilder.append('V');
                i = 5;
            }
            for (; i < one; i++) {
                stringBuilder.append('I');
            }
        }

        return stringBuilder.toString();
    }
}

