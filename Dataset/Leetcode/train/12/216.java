 class Solution {
    int[] val = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] str = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public String XXX(int x) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < val.length && x > 0; i++) {
            int cv = val[i];
            String cs = str[i];
            while (x >= cv) {
                sb.append(cs);
                x -= cv;
            }
        }
        return sb.toString();
    }
}
