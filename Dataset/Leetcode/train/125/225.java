 class Solution {
    public boolean XXX(String s) {
        char[] sc =s.toCharArray();
        String str ="";
        for(int i =0;i<sc.length;i++){
            if(sc[i]<='9'&&sc[i]>='0'){
                str += sc[i];
            }
            if(sc[i]>='A'&&sc[i]<'Z'){
                sc[i] += 32;
                str += sc[i];
                continue;
            }
            if(sc[i]>='a'&&sc[i]<'z'){
                str += sc[i];
            }
        }
        char[] res =str.toCharArray();
        for(int i=0,j=res.length-1;i<j;i++,j--){
            if(res[i]!=res[j])return false;
        }
        return true;
    }
}

