 class Solution {
    public String XXX(int n) {
        if(n == 1) return "1";

        StringBuilder res = new StringBuilder("11");

        for(int i = 2; i < n; i++){
            
            StringBuilder itemRes = new StringBuilder();
            int charNum = 1;
            
            for(int j = 1; j < res.length(); j++){
                if(res.charAt(j - 1) == res.charAt(j)){
                    charNum ++;
                }else{
                    itemRes.append(String.valueOf(charNum) + String.valueOf(res.charAt(j - 1)));
                    charNum = 1;
                }
            }
            
            itemRes.append(String.valueOf(charNum) + String.valueOf(res.charAt(res.length() - 1)));
            res = itemRes;
            
        }
        return res.toString();
    }
}

