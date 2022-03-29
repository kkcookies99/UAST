class Solution {
    public String XXX(String a, String b) {
        StringBuffer result=new StringBuffer();
        boolean aLonger=a.length()>=b.length()?true:false;
        String shorter=aLonger?b:a;
        String longer=aLonger?a:b;
        boolean jinwei=false;
        int index_l=longer.length()-1;
        int index_s=shorter.length()-1;
        for(int i=0;i<longer.length();i++){
            int temp=index_s>=0?(longer.charAt(index_l)-'0'+shorter.charAt(index_s)-'0'):(longer.charAt(index_l)-'0');
            if(jinwei){
                temp++;
            }
            if(temp>=2){
                result.append(temp-2);
                jinwei=true;
            }else{
                result.append(temp);
                jinwei=false;
            }
            index_l--;
            index_s--;
        }
        if(jinwei){
            result.append('1');
        }

        return result.reverse().toString();
    }
}

