 class Solution {
    public String XXX(int num) {
        String[] alp = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] sum = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        int i = 0;
        StringBuffer sb = new StringBuffer();
        while(num > 0){
            if(num >= sum[i]){
                sb.append(alp[i]);
                num -= sum[i];
            }else{
                i++;
            }
        }
        return sb.toString();
    }
}

