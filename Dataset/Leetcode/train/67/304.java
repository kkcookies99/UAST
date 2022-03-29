 public String XXX(String a, String b) {
        int l1=a.length()-1,l2=b.length()-1;
        StringBuffer res= new StringBuffer();
        int flag=0,t1=0,t2=0;
        while(l1>=0 || l2>=0){
            t1=l1<0 ? 0:a.charAt(l1--)-'0';
            t2=l2<0 ? 0:b.charAt(l2--)-'0';
            int temp=t1+t2+flag;
            char p=(char)(temp%2+'0');
            res.append(p);
            flag=temp>1 ? 1:0;
        }
        if(flag==1){
        res.append(flag);
        }
        return res.reverse().toString();
    }

