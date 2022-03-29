class Solution {
    public int XXX(String s) {
        int status = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    result += 1;
                    status = 1;
                    break;
                case 'V':
                    result += 5;
                    if (status == 1) {
                        result -= 2;
                    }
                    break;
                case 'X':
                    result += 10;
                    if (status == 1) {
                        result -= 2;
                    }
                    status = 2;
                    break;
                case 'L':
                    result += 50;
                    if (status == 2) {
                        result -= 20;
                    }
                    break;
                case 'C':
                    result += 100;
                    if (status == 2) {
                        result -= 20;
                    }
                    status = 3;
                    break;
                case 'D':
                    result += 500;
                    if (status == 3) {
                        result -= 200;
                    }
                    break;
                case 'M':
                    result += 1000;
                    if (status == 3) {
                        result -= 200;
                    }
                    break;
                default:
            }

        }
        return result;
    }
}

