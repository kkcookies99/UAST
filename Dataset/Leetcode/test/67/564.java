class Solution {
    public String XXX(String a, String b) {
                if(a == "0")
            return b;
        else if (b == "0")
            return a;
        String ans = "";
        int up = 0;
        int alen = a.length();
        int blen = b.length();
        int time = alen > blen ? alen : blen;
        char[] anschar = new char[time+1];
        char[] lista = a.toCharArray();
        char[] listb = b.toCharArray();
        while (time >= 0) {
            int thenum = 0;
            if (alen > 0 && blen > 0){
                alen--;
                blen--;
                thenum = lista[alen]-48 + listb[blen]-48 + up;
                up = 0;
            }else
            if (alen == 0 && blen > 0){
                blen--;
                thenum = listb[blen]-48 + up;
                up = 0;
            }else
            if (alen > 0 && blen == 0){
                alen--;
                thenum = lista[alen]-48 + up;
                up = 0;
            }else
            if (alen == 0 && blen == 0){
                thenum = up;
                up = 0;
            }
            if(thenum == 2){
                thenum = 0;
                up = 1;
            }else if(thenum == 3){
                thenum = 1;
                up = 1;
            }
            anschar[time] = (char) thenum;
            time--;
        }
        StringBuilder ansstr = new StringBuilder();
        boolean frist = true;
        for (int i = 0; i<anschar.length;i++){
            if(frist && anschar[i] == '\u0000'){
                //跳过第一位为0的
                frist = false;
            }else if(anschar[i] == '\u0000'){
                ansstr.append("0");
            }else if(anschar[i] == '\u0001'){
                ansstr.append("1");
                frist = false;
            }
        }
        return  ansstr.toString();
    }
}

