class Solution {
    public boolean XXX(int x) {
        int[] a = new int[10];
        int i = 0;
        if(x < 0){
            return false;
        }else if(x == 0){
            return true;
        }else{
            while(x != 0){
                a[i] = x%10;
                x = x/10;
                i++;
            }   //最后i值是x的位数
            for(int j = 0; j < i; j++){
                if(a[j] != a[i-j-1]){
                    return false;
                }
            }
            return true;
        }
    }
}

