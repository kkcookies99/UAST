 class Solution {
    public int XXX(int x) {
         int result = 0;
        try {
            result = fun(x, 0);
            char c=String.valueOf(x % 10).charAt(0);
            if (c!='0'&&String.valueOf(result).charAt(0) != c) {
                result = 0;
            }
        } catch (Exception e) {
            result = 0;
        }

        return result;
    }

    static int fun(int x,int result){
        return x==0?result:fun(x/10,result*10+x%10);
    }

}

