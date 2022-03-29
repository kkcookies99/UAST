class Solution {
    public int XXX(int x) {
        long temp = 0;
        while (x >= 0){
            if (temp * temp > x){
                break;
            }else{
                temp ++;
            }
        }
        return(int) temp -1;
    }
}



