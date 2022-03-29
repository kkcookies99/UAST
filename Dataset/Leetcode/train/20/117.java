 class Solution {
    public boolean XXX(String s) {

        while (s.contains("()") || s.contains("{}") || s.contains("[]")){
            s = s.replace("()","");
            s = s.replace("{}","");
            s = s.replace("[]","");
        }
       return s.isEmpty();
    }
}

