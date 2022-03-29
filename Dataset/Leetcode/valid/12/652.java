 class Solution {
    public String XXX(int num) {
        StringBuilder sb = new StringBuilder();
        int t = num / 1000;
        int h = (num / 100) % 10;
        int ty = (num / 10) % 10;
        int unit = num % 10;
        for (int i = 0; i < t; i++) {
            sb.append("M");
        }
        if (h == 9) {
            sb.append("CM");
        } else if (h == 4) {
            sb.append("CD");
        } else {
            if (h >= 5) {
                sb.append("D");
                h-=5;
            }
            for (int i = 0; i < h; i++) {
                sb.append("C");
                
            }
        }
        if (ty == 9) {
            sb.append("XC");
        } else if (ty == 4) {
            sb.append("XL");
        } else {
            if (ty >= 5) {
                sb.append("L");
                ty-=5;
            }
            for (int i = 0; i < ty; i++) {
                sb.append("X");

            }
        }
        if (unit == 9) {
            sb.append("IX");
        } else if (unit == 4) {
            sb.append("IV");
        } else {
            if (unit >= 5) {
                sb.append("V");
                unit-=5;
            }
            for (int i = 0; i < unit; i++) {
                sb.append("I");

            }
        }
        return new String(sb);
    }
}

