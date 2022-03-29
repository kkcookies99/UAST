class Solution {
    public int XXX(String s) {
        int last = 0, result = 0;
        for(int i = 0; i < s.length();i++){
            switch(s.charAt(i)) {
                case 'I':
                    result += 1;
                    last = 1;
                    break;
                case 'V':
                    if (last == 1) {
                        result += 3;
                    } else {
                        result += 5;
                    }
                    last = 5;
                    break;
                case 'X':
                    if (last == 1) {
                        result += 8;
                    } else {
                        result += 10;
                    }
                    last = 10;
                    break;
                case 'L':
                    if (last == 10) {
                        result += 30;
                    } else {
                        result += 50;
                    }
                    last = 50;
                    break;
                case 'C':
                    if (last == 10) {
                        result += 80;
                    } else {
                        result += 100;
                    }
                    last = 100;
                    break;
                case 'D':
                    if (last == 100) {
                        result += 300;
                    } else {
                        result += 500;
                    }
                    last = 500;
                    break;
                case 'M':
                    if (last == 100) {
                        result += 800;
                    } else {
                        result += 1000;
                    }
                    last = 1000;
                    break;
            }
        }
        return result;
    }
}

