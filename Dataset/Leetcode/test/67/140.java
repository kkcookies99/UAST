 class Solution {
    public String XXX(String a, String b) {
        int i = a.length()-1,j = b.length()-1;
        int count = 0,sum = 0;
        String c = "";
        for(;i >= 0 || j >= 0;i--,j--){
            sum = 0;
            if(i >= 0){
                sum = sum + (int)(a.charAt(i) - '0');
            }
            if(j >= 0){
                sum = sum + (int)(b.charAt(j) - '0');
            }
            sum = sum + count;
            count = 0;
            if(sum>=2){
                count = sum / 2;
                sum = sum % 2;
            }
            c = sum + c;
        }
        
        if(count > 0){
            c = count + c;
        }
        return c;
    }
}

