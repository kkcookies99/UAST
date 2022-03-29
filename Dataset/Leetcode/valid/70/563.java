class Solution {
    public int XXX(int n) {
        if(n<3){
            return n;
        }
        int[] climbs = new int[n];
        climbs[0] = 1;
        climbs[1] =2;
        for(int i=2;i<climbs.length;i++){
            climbs[i] = climbs[i-1]+climbs[i-2];
        } 

        return climbs[n-1];
    }
}

