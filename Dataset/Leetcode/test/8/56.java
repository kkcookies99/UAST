public int XXX(String str) {
        int index=0, len=str.length();
        while (index<len&&str.charAt(index)==' ') index++;
        if(index==len) return 0;
        char ch=str.charAt(index);
        int flag=1,res=0;
        if(ch!='+'&&ch!='-'&&!Character.isDigit(ch)) return 0;
        if(ch=='+'||ch=='-'){
            flag=(ch=='+'?1:-1);
            index++;
        }
        if(ch=='0'){
            index++;
        }
        if(index<len){
            long temp=0;
            while (index<len&&Character.isDigit(str.charAt(index))){
                temp=temp*10+str.charAt(index)-'0';
                if(temp*flag>Integer.MAX_VALUE){
                    temp=Integer.MAX_VALUE;
                    break;
                }else if(temp*flag<Integer.MIN_VALUE){
                    temp=Integer.MIN_VALUE;
                    break;
                }
                index++;
            }
            res= (int) (temp*flag);
        }
        return res;
    }

