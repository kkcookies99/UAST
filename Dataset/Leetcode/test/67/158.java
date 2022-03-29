 public String XXX(String a, String b) {
        if(a==null || b==null){
            return "";
        }
        StringBuilder rsp=new StringBuilder();
        int carry=0;
        int aLength=a.length()-1;
        int bLength=b.length()-1;
        while(aLength>=0 || bLength>=0){
            int aa=aLength < 0 ? 0 : a.charAt(aLength)-'0';
            int bb=bLength < 0 ? 0 : b.charAt(bLength)-'0';
            int sum=aa+bb+carry;
            rsp.append(sum%2);
            carry=sum/2;
            aLength--;
            bLength--;
        }
        if(carry>0){
            rsp.append(carry);
        }
        return rsp.reverse().toString();
    }

