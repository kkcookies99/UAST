class Solution {
    public int XXX(int x) {
        String str=String.valueOf(x);
        StringBuffer sbf=new StringBuffer(str);
        sbf.XXX();
        if(sbf.charAt(sbf.length()-1)=='-'){
            sbf.deleteCharAt(sbf.length()-1);
            sbf.insert(0,'-');
        }
        int result=0;
        try{
            result=Integer.parseInt(sbf.toString());  
        }catch(Exception e){
            return 0;
        }
        return result;
    }
}

