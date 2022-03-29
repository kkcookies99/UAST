class Solution {
    public int XXX(int x) {
        int left = 0;
        int right = x;
        int middle = 0;
        int pro = 0;
        while(left <= right){
            middle = (left + right) / 2;
            pro = middle * middle;
            if(pro == x){
                return middle;
            }else if(pro < x){
                left = middle + 1;
            }else{
                right = middle - 1;
            }
        }
        return left - 1;

    }
}
