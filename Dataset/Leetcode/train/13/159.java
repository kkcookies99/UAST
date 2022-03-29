class Solution {
    public int XXX(String s) {
        //先解析千位
        int qian = 0;
        if(s.charAt(0) == 'M'){
            while(qian < s.length() && s.charAt(qian) == 'M'){
                qian++;
            }
            s = s.substring(qian);
        }
        if(s.length() == 0)   //解析完毕
            return qian*1000;
        
        int bai = 0;
        if(s.charAt(0) == 'C'){
            if(s.length() == 1){
                bai = 1;
                s = s.substring(1);
            }
            else if(s.charAt(1) == 'M'){
                bai = 9;
                s = s.substring(2);
            }
            else if(s.charAt(1) == 'D'){
                bai = 4;
                s = s.substring(2);
            }
            else{
                while(bai < s.length() && s.charAt(bai) == 'C')
                    bai++;
                s = s.substring(bai);
            }
        }
        else if(s.charAt(0) == 'D'){
            bai = 5;
            while((bai - 4) < s.length() && s.charAt(bai - 4) == 'C')
                bai++;
            s = s.substring(bai - 4);
        }
        else{}
        if(s.length() == 0)            //解析完毕
            return qian*1000 + bai*100;
        
        
        int shi = 0;
        if(s.charAt(0) == 'X'){
            if(s.length() == 1){
                shi = 1;
                s = s.substring(1);
            }
            else if(s.charAt(1) == 'C'){
                shi = 9;
                s = s.substring(2);
            }
            else if(s.charAt(1) == 'L'){
                shi = 4;
                s = s.substring(2);
            }
            else{
                while(shi < s.length() && s.charAt(shi) == 'X')
                    shi++;
                s = s.substring(shi);
            }
        }
        else if(s.charAt(0) == 'L'){
            shi = 5;
            while((shi - 4) < s.length() && s.charAt(shi - 4) == 'X')
                shi++;
            s = s.substring(shi - 4);
        }
        else{}
        if(s.length() == 0)                     //解析完毕
            return qian*1000 + bai*100 + shi*10;
        
        int ge = 0;
        if(s.charAt(0) == 'I'){
            if(s.length() == 1)
                ge = 1;
            else if(s.charAt(1) == 'X')
                ge = 9;
            else if(s.charAt(1) == 'V')
                ge = 4;
            else{
                while(ge < s.length() && s.charAt(ge) == 'I')
                    ge++;
                s = s.substring(ge);
            }
        }
        else{
            ge = 5;
            while((ge - 4) < s.length() && s.charAt(ge - 4) == 'I')
                ge++;
            s = s.substring(ge - 4);
        }
        
        return qian*1000 + bai*100 + shi*10 + ge;
    }
}

