class Solution {
    public int XXX(int n) {
        //循环牛逼

        int a = 0, b = 1, sum = 0;
        for(int i = 0; i < n; i++){
            sum = (a + b);
            a = b;
            b = sum;
        }

        return sum;

    }
}



    //递归耗时
    // public int XXX(int n) {
    //     if(n == 1) 
    //             return 1;
    //     if(n == 2)
    //         return 2;
            
    //     return XXX(n-1)+XXX(n-2);
    // }

