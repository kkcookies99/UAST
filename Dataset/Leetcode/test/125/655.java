 class Solution {
    public boolean XXX(String s) {
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(!isValid(s.charAt(l))){
                l++;
                continue;
            }
            if(!isValid(s.charAt(r))){
                r--;
                continue;
            }
            if(equal(s.charAt(l),s.charAt(r))){
                l++;
                r--;
            }else{
                return false;
            }
        }
       return true; 
    }
    
    public boolean equal(char c1,char c2){
        if(c1==c2){
            return true;
        }
        if(c1>='a'&&c1<='z'&&c2>='A'&&c2<='Z'){
            if((char)(c2+32)==c1){
                return true;
            }
        }
        if(c2>='a'&&c2<='z'&&c1>='A'&&c1<='Z'){
            if((char)(c1+32)==c2){
                return true;
            }
        }
       
        return false;
    }
    
    public boolean isValid(char c){
        if(c>='0'&&c<='9'){
            return true;
        }
        if(c>='a'&&c<='z'){
            return true;
        }
        if(c>='A'&&c<='Z'){
            return true;
        }
        return false;
    }
}



