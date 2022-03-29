 class Solution {
    public boolean XXX(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
            char ci=s.charAt(i);
            if(!(ci>='0'&&ci<='9'||ci>='a'&&ci<='z'||ci>='A'&&ci<='Z')){
                i++;
                continue;
            }
            char cj=s.charAt(j);
            if(!(cj>='0'&&cj<='9'||cj>='a'&&cj<='z'||cj>='A'&&cj<='Z')){
                j--;
                continue;
            }
            if((ci & 0xDF) != (cj & 0xDF)) return false;
            i++;
            j--;
        }
        return true;
    }
}

