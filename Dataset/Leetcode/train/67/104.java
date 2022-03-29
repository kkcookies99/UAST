     public String XXX(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        StringBuffer sb=new StringBuffer();
        int value,carry=0;
        while(i>=0&&j>=0) {
            value = (a.charAt(i)-'0')+(b.charAt(j)-'0')+carry;
            sb.append(value%2);
            carry=value/2;
            i--;
            j--;
        }
        if(j>=0){i=j;a=b;}//统一将a设为还有剩余的字符串
        while(i>=0||carry==1){
            if(i<0) {sb.append('1');break;}
            value=carry+(a.charAt(i)-'0');
            sb.append(value%2);
            carry=value/2;
            i--;
        }
        return sb.reverse().toString();
    }

