 class Solution {
    public int XXX(String str) {
        String s=str.trim();
        StringBuffer sb=new StringBuffer(s);
        StringBuffer sbf=new StringBuffer();
        int result=0;
        int i=0;
        if(s.length()<1)
            return 0;
        if(s.length()==1){
            if(sb.charAt(i)<'0' || sb.charAt(i)>'9')
                return 0;
        }
        //此时保证是两位数以上
        //确保第一位不是字母
        if((sb.charAt(0)!='-'&& sb.charAt(0)!='+') && (sb.charAt(0)<'0' || sb.charAt(0)>'9'))
            return 0;
        if(sb.charAt(0)=='-'|| sb.charAt(0)=='+'){
            if(sb.charAt(1)<'0' || sb.charAt(1)>'9')
                return 0;
            if(sb.charAt(0)=='+')
                i++;
            if(sb.charAt(0)=='-'){
                sbf.insert(0,'-');
                i++;
            }
        }
        while(i<sb.length() && sb.charAt(i)>='0' && sb.charAt(i)<='9'){
               sbf.append(sb.charAt(i));
               i++;
           }       
        try{
             result=Integer.parseInt(sbf.toString());
        }catch(Exception e){
            if(sbf.charAt(0)!='-')
            result=Integer.MAX_VALUE;
            if(sbf.charAt(0)=='-')
            result=Integer.MIN_VALUE;
        }
            return result;
    }
}

