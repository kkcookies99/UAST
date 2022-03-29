class Solution {
    public int XXX(String s) {
        int len = s.length();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (i != len -1 && getVal(s.charAt(i + 1)) > getVal(s.charAt(i))){
                sum -= getVal(s.charAt(i));
            }else {
                sum += getVal(s.charAt(i));
            }

        }
        return sum;
    }
    int getVal(char ch){
        switch (ch){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
}

