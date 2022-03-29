    public int XXX(String s) {
        int res =0;
        int flag=0;
         for (int i = s.length()-1; i >=0 ; i--) {
            switch (s.charAt(i)){
                case 'I':
                    if (flag<=1)
                        res+=1;
                    else
                        res-=1;
                    flag=1;
                    break;
                case 'V':
                    if (flag<=2)
                        res+=5;
                    else
                        res-=5;
                    flag=2;
                    break;
                case 'X':
                    if (flag<=3)
                        res+=10;
                    else
                        res-=10;
                    flag=3;
                    break;
                case 'L':
                    if (flag<=4)
                        res+=50;
                    else
                        res-=50;
                    flag=4;
                    break;
                case 'C':
                    if (flag<=5)
                        res+=100;
                    else
                        res-=100;
                    flag=5;
                    break;
                case 'D':
                    if (flag<=6)
                        res+=500;
                    else
                        res-=500;
                    flag=6;
                    break;
                case 'M':
                    if (flag<=7)
                        res+=1000;
                    else
                        res-=1000;
                    flag=7;
                    break;
            }
        }
        return res;
    }

