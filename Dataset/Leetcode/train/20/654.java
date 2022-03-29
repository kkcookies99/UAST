 class Solution {
    public boolean XXX(String s) {
        s=s.replace("()","");
        s=s.replace("[]","");
        s=s.replace("{}","");
        if(s.contains("()")||s.contains("[]")||s.contains("{}")){
            return XXX(s);
        }
        return s.equals("");
}
}

