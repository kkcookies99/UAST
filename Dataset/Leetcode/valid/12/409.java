 class Solution {
    public String XXX(int num) {
        StringBuilder sb = new StringBuilder();
        char[] five = new char[]{'0','V','L','D'};
        char[] ten = new char[]{'I','X','C','M'};
        int[] temp = new int[]{0,1,10,100,1000};
        for(int i = 3; i >=0 && num > 0;){
            if(num >= temp[i+1]){
                // 1000+
                sb.append(ten[i]);
                num -= temp[i+1];
            }else if(num >= temp[i+1] - temp[i]){
                // 900+
                sb.append(ten[i-1]);
                sb.append(ten[i]);
                num -= temp[i+1] - temp[i];
                i--;
            }else if(num >= temp[i+1]/2){
                // 500+
                sb.append(five[i]);
                num -= temp[i+1]/2;
                i--;
            }else if(num >= temp[i+1]/2 - temp[i]){
                // 400+
                sb.append(ten[i-1]);
                sb.append(five[i]);
                num -= temp[i+1]/2 - temp[i];
                i--;
            }else{ i--; }
        }
        return sb.toString();
    }
}

