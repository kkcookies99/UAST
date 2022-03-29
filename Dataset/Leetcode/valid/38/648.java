 class Solution {
    public String XXX(int n) {
        int countNum = n;
        String str = "1";
        while (true){
            if (n==1){
                return str;
            }
            countNum--;
            char[] chars = str.toCharArray();
            //折合成的新字符串
            String strFalg = "";
            //统计每个字符出现的次数
            int countSum = 0;
            char falg = chars[0];
            for (int i = 0; i < chars.length; i++) {
                if (chars[i]==falg){
                    countSum++;
                }else{
                    strFalg += (countSum + "" + chars[i-1]);
                    falg = chars[i];
                    countSum = 1;
                }
            }

            strFalg += (countSum + "" + chars[chars.length-1]);

            if (countNum == 1){
                return strFalg;
            }
            str = strFalg;
        }
    }
}

