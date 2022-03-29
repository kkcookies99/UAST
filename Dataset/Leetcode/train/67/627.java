class Solution {
    public String XXX(String a, String b) {
        while(a.length()<b.length())
            a=0+a;
        while(b.length()<a.length())
            b=0+b;
        StringBuffer result=new StringBuffer("");
        int n=a.length()-1,m=0;
        while(n>=0){
            switch(a.charAt(n)+b.charAt(n)){
            case 96:
                if(m==0)
                    result.append("0");
                else{
                    result.append("1");
                    m=0;
                }
                break;
            case 97:
                if(m==0)
                    result.append("1");
                else
                    result.append("0");
                break;
            case 98:
                if(m==1)
                    result.append("1");
                else
                    result.append("0");
                m=1;
                break;                                  
            }
            n--;
        }
        if(m==1)
            result.append("1");
        result.reverse();
        return String.valueOf(result);
    }
}

