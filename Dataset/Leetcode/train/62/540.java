class Solution {
    public int XXX(int m, int n) {
        int steps = m + n - 2;
        int shorterSide = m < n ? (m - 1) : (n - 1);
        long temp = 0;
        int a = steps - shorterSide;
        if(a > shorterSide){
            long temp1 = 1;
            long temp2 = 1;
            for(int i = a + 1; i < steps + 1;i++){
                temp1 = temp1 * i;
            }
            for(int i = 1; i < shorterSide + 1; i++){
                temp2 = temp2 * i;
            }
            temp = temp1 / temp2;
        } else{
            long temp1 = 1;
            long temp2 = 1;
            for(int i = shorterSide + 1; i < steps + 1;i++){
                temp1 = temp1 * i;
            }
            for(int i = 1; i < a + 1; i++){
                temp2 = temp2 * i;
            }
            temp = temp1 / temp2;
        }
        int result = (int)temp;
        return result;
    }
}


