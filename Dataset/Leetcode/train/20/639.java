 class Solution {
    public boolean XXX(String s) {
        int a=s.length()/2;
        for(int i=0;i<a;i++){
            s=s.replace("()","").replace("{}","").replace("[]","");
        }
        return s.length()==0;
    }
}




