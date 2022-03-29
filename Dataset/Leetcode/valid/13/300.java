class Solution {
    public int XXX(String s) {
        int res = 0;
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] reps = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i = 0; i< values.length; i++){
            while(s != null && s.length() > 0 && s.startsWith(reps[i])){
                res += values[i];
                s = s.substring(reps[i].length());
            }
        }
        return res;
    }
}

