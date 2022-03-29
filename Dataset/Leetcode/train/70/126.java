class Solution {
    public int XXX(int n) {
        if(n<3){
            return n;
        }
        int[] array = new int[n+1];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        for(int i = 3;i<n+1;i++){
            array[i] = array[i-1]+array[i-2];
        }
        return array[n];
    }
}

