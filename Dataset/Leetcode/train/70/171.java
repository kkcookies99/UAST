class Solution {
    public int XXX(int n) {
        if(n==1) {
            return 1;
        }
        if(n==2) {
            return 2;
        }
        int first = 1;
        int second = 2;
        int result = 0;
        for(int i = 2;i <n;i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
}

