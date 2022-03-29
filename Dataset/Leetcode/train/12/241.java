 class Solution {
    public String XXX(int num) {
        int[] keys = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] values = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuffer sb = new StringBuffer();
        int N = keys.length;
        int e = 0;
        while(e < N) {
            if(num >= keys[e]) {
                sb.append(values[e]);
                num -= keys[e];
            }else {
                e++;
            }
        }
        return sb.toString();
    }
}

