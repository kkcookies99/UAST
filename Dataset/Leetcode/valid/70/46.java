class Solution {
    public int XXX(int n) {
        if(n <= 2){
            return n;
        }
        int num1 =  1;
        int num2 = 2;
        int numN = 0;
        for(int i = 2;i < n;i ++){
            numN = num1 + num2;
            num1 = num2;
            num2 = numN;
        }
        return numN;
    }
}

