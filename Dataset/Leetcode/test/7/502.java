 class Solution {
    public int XXX(int x) {
        if(x==0){
            return x;
        }
        
        String s=x+"";
        int len=s.length();
        int index=0;
        String s2="";
        
        for(int i=0;i<len;i++){
            if(s.charAt(i)<=0){
                len--;
            }else{
                break;
            }
        }
        
        if(s.charAt(index)=='-'){
            index++;
            s2="-";
        }
        
        StringBuilder sb=new StringBuilder(s.substring(index,len));
        
        s=s2+sb.XXX().toString();

        int number=0;
        try{
            number=new Integer(s).parseInt(s);     
        }catch(NumberFormatException e){
            return (number>Integer.MAX_VALUE||number<Integer.MIN_VALUE)?0:number;
        }
        return number;
    }
}

