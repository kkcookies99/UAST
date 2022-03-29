 class Solution {
    public int XXX(String s) {
        int res = 0;
        char cur, nxt;
        for(int i = 0; i < s.length(); i++){
            cur = s.charAt(i);
            nxt = i + 1 < s.length() ? s.charAt(i + 1) : cur;
            if(cur == 'M'){
                res += 1000;
            }else if(cur == 'C' && nxt == 'M'){
                res += 900;
                i++;
            }else if(cur == 'D'){
                res += 500;
            }else if(cur == 'C' && nxt == 'D'){
                res += 400;
                i++;
            }else if(cur == 'C'){
                res += 100;
            }else if(cur == 'X' && nxt == 'C'){
                res += 90;
                i++;
            }else if(cur == 'L'){
                res += 50;
            }else if(cur == 'X' && nxt == 'L'){
                res += 40;
                i++;
            }else if(cur == 'X'){
                res += 10;
            }else if(cur == 'I' && nxt == 'X'){
                res += 9;
                i++;
            }else if(cur == 'V'){
                res += 5;
            }else if(cur == 'I' && nxt == 'V'){
                res += 4;
                i++;
            }else{
                res += 1;
            }
        }
        return res;
    }
}

