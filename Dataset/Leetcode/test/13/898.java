 class Solution {
    public int XXX(String s) {
        char[] lm = s.toCharArray();
        int res = 0;
        for(int i = 0; i < lm.length; i++){
            char xxx = lm[i];
            //判断I
            if(lm[i] == 'I'){
                if(i +1 < lm.length && lm[i + 1] =='V'){
                    res +=4;
                    i++;
                    continue;
                }
                if(i +1 < lm.length && lm[i + 1] =='X'){
                    res +=9;
                    i++;
                    continue;
                }
                res += 1;
            }
            //判断V
            if(lm[i] == 'V'){
                res += 5;
            }
            //判断X
            if(lm[i] == 'X'){
                if(i +1 < lm.length && lm[i + 1] =='L'){
                    res +=40;
                    i++;
                    continue;
                }
                if(i +1 < lm.length && lm[i + 1] =='C'){
                    res +=90;
                    i++;
                    continue;
                }
                res += 10;
            }
            //判断L
            if(lm[i] == 'L'){
                res += 50;
            }
            //判断C
            if(lm[i] == 'C'){
                if(i +1 < lm.length && lm[i + 1] =='D'){
                    res +=400;
                    i++;
                    continue;
                }
                if(i +1 < lm.length && lm[i + 1] =='M'){
                    res +=900;
                    i++;
                    continue;
                }
                res += 100;
            }
            //判断D
            if(lm[i] == 'D'){
                res += 500;
            }
            //判断M
            if(lm[i] == 'M'){
                res += 1000;
            }
        }
        return res;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


