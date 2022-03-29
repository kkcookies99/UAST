     public String XXX(int num) {
        StringBuilder resp=new StringBuilder();
        int t1=num/1000;
        //千位
        for(int i=0;i<t1;i++) resp.append('M');
        num%=1000;
        int t2=num/100*100;
        //百位
        if(t2==900)
        {
            resp.append("CM");
            num-=900;
        }
        else if(t2==400)
        {
            resp.append("CD");
            num-=400;
        }
        else{
            if(num>=500)
            {
                resp.append('D');
                num-=500;
            }
            int t3=num/100;
            for(int i=0;i<t3;i++)
            {
                resp.append('C');
            }
            num%=100;
        }
        //十位
        int t4=num/10*10;
        if(t4==90)
        {
            resp.append("XC");
            num-=90;
        }
        else if(t4==40)
        {
            resp.append("XL");
            num-=40;
        }
        else{
            if(num>=50)
            {
                resp.append('L');
                num-=50;
            }
            int t5=num/10;
            for(int i=0;i<t5;i++)
            {
                resp.append('X');
            }
            num%=10;
        }
        //个位
        if(num==9)
        {
            resp.append("IX");
        }
        else if(num==4)
        {
            resp.append("IV");
        }
        else{
            if(num>=5)
            {
                resp.append('V');
                num-=5;
            }
            for(int i=0;i<num;i++)
            {
                resp.append('I');
            }
        }
        return resp.toString();
    }

