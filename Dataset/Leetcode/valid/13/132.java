class Solution {
    public int XXX(String s) {
        int res = 0;
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'I':
                    res += 1;
                    flag = 1; 
                    break;
                case 'V':
                    if (flag == 1) {
                        res = res + 5 - 2; 
                    } else {
                        res += 5;
                    }
                    flag = 0; 
                    break;
                case 'X':
                    if (flag == 1) {
                        res = res + 10 - 2;
                    } else {
                        res += 10;
                    }
                    flag = 2; 
                    break;
                case 'L': 
                    if (flag == 2) {
                        res = res + 50 - 20;
                    } else {
                        res += 50;
                    }
                    flag = 0;
                    break;
                case 'C':
                    if (flag == 2) {
                        res = res + 100 - 20;
                    } else {
                        res += 100;
                    }
                    flag = 3; 
                    break;
                case 'D': 
                    if (flag == 3) {
                        res = res + 500 - 200;
                    } else {
                        res += 500;
                    }
                    flag = 0; 
                    break;
                case 'M': 
                    if (flag == 3) {
                        res = res + 1000 - 200;
                    } else {
                        res += 1000;
                    }
                    flag = 0; 
                    break;
            }
        }
        return res;
    }
}