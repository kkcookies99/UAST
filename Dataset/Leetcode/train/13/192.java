class Solution {
    public int XXX(String s) {
        int num = 0;
        int l = s.length();
        for (int i = 0,j = 1; i < l; i++,j++) {
            switch (s.charAt(i)) {
                case 'M':
                    num += 1000;
                    break;
                case 'D':
                    num += 500;
                    break;
                case 'C':                
                    if (j < l && (s.charAt(j) == 'D' || s.charAt(j) == 'M')) {
                        num -= 100;
                    } else {
                        num += 100;
                    }                    
                    break;
                case 'L':
                    num += 50;
                    break;
                case 'X':
                    if (j < l && (s.charAt(j) == 'L' || s.charAt(j) == 'C')) {
                        num -= 10;
                    } else {
                        num += 10;
                    }
                    break;
                case 'V':
                    num += 5;
                    break;
                case 'I':
                    if (j < l && (s.charAt(j) == 'V' || s.charAt(j) == 'X')) {
                        num -= 1;
                    } else {
                        num += 1;
                    }
                    break;
            }
        }        
        return num;
    }
}

