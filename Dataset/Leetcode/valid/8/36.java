class Solution {
    public int XXX(String str) {
        if(str.isEmpty())return 0;
        int base=0,sign=1,i=0;
        boolean flag=false;
        while(i<str.length()&&str.charAt(i)==' ')i++;
        while(i<str.length()&&(str.charAt(i)=='+'||str.charAt(i)=='-')){
            if(flag==false){
                if(str.charAt(i)=='-'){
                    sign=-1;
                    i++;
                }
                else{
                    sign=1;
                    i++;
                }
                flag=true;
            }
            else return 0;
        }
        while(i<str.length()&&(str.charAt(i)>='0'&&str.charAt(i)<='9')){
            if(base>(Integer.MAX_VALUE)/10||(base==(Integer.MAX_VALUE)/10)&&str.charAt(i)-'0'>7){
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            else base=base*10+(str.charAt(i++)-'0');
        }
        return base*sign;
    }
}

