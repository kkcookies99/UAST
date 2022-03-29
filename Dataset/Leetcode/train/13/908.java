 public int XXX(String s) {
        int temp=0,sum=0;
        for(int i = s.length() - 1; i >=0;i--){
           if (s.charAt(i) == 'I')
               temp =1;
           if (s.charAt(i) == 'V'){
               if (i>0 && s.charAt(i-1) == 'I') {
                   temp = 4;i--;
               }else {
                   temp = 5;
               }
           }
            if (s.charAt(i) == 'X'){
                if (i>0 && s.charAt(i-1) == 'I') {
                    temp = 9;i--;
                }else {
                    temp = 10;
                }
            }
            if (s.charAt(i) == 'L'){
                if (i>0 && s.charAt(i-1) == 'X') {
                    temp = 40;i--;
                }else {
                    temp = 50;
                }
            }
            if (s.charAt(i) == 'C'){
                if (i>0 && s.charAt(i-1) == 'X') {
                    temp = 90;i--;
                }else {
                    temp = 100;
                }
            }
            if (s.charAt(i) == 'D'){
                if (i>0 && s.charAt(i-1) == 'C') {
                    temp = 400;i--;
                }else {
                    temp = 500;
                }
            }
            if (s.charAt(i) == 'M'){
                if (i>0 && s.charAt(i-1) == 'C') {
                    temp = 900;i--;
                }else {
                    temp = 1000;
                }
            }
            sum +=temp;
        }
        return sum;
    }

