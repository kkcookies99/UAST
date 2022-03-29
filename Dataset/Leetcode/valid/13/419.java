 class Solution {
    public int XXX(String s) {
        int sum = 0;
        int level = 0;
        char[] charArray = s.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            char c = charArray[i];
            int val = char2int(c);
            if (val < level) {
                sum -= val;
            } else {
                sum += val;
                level = val;
            }
        }
        return sum;
    }

    private int char2int(char c){
        switch (c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:return 0;
        }
    }
}

