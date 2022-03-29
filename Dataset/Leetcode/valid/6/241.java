 class Solution {
    public String XXX(String s, int numRows) {
        int length = s.length();

        if(length <= numRows ||numRows == 1) return s;

        int n = numRows * 2 - 2;
        char[] chars = s.toCharArray();
        char[] ans = new char[length];
        int index = 0;

        for (int i = 0; i < numRows; i++) {
            int step = 2 * i;
            for(int j = i; j < length ;j += step){
                ans[index++] = chars[j];
                int nextStep = n - step;
                step = nextStep == 0 ? step : nextStep;
            }
        }
        
        return new String(ans);

    }
}

