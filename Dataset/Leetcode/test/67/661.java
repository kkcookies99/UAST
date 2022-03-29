class Solution {
    public String XXX(String a, String b) {
        int n = Math.min(a.length(), b.length());
        int i = n-1, cnt = 0;
        StringBuilder res = new StringBuilder();
        //相同部分相加
        int x = 0;
        int y = 0;
        String subA = a.substring(a.length()-n, a.length());
        String subB = b.substring(b.length()-n, b.length());
        while(i >= 0){
            x = Integer.parseInt(subA.substring(i,i+1));
            y = Integer.parseInt(subB.substring(i,i+1));
            res.append((x+y+cnt)%2);
            cnt = (x + y + cnt) / 2;
            i--;
        }
        if(a.length() > b.length()){
            i = a.length() - b.length() - 1;
            while(i >= 0){
                x = Integer.parseInt(a.substring(i,i+1));
                res.append((cnt + x) % 2);
                cnt = (cnt + x) / 2;
                i--;
            }
            if(cnt > 0){
                res.append(cnt);
            }
        }else{
            i = b.length() - a.length() - 1;
            while( i >= 0){
                y = Integer.parseInt(b.substring(i,i+1));
                res.append((cnt + y) % 2);
                cnt = (cnt + y) / 2;
                i--;
            }
            if(cnt > 0){
                res.append(cnt);
            }
        }
        return res.reverse().toString();
    }
}

