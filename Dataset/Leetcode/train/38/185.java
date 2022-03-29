class Solution {
    public String XXX(int n) {
        if(n == 1) return "1";
        String s = "1";
        for(int i = 1; i < n; i++){
            s = s.replace("111","a");
            s = s.replace("222","b");
            s = s.replace("11","c");
            s = s.replace("22","d");
            s = s.replace("33","e");
            s = s.replace("1","f");
            s = s.replace("2","g");
            s = s.replace("3","h");
            s = s.replace("a","31");
            s = s.replace("b","32");
            s = s.replace("c","21");
            s = s.replace("d","22");
            s = s.replace("e","23");
            s = s.replace("f","11");
            s = s.replace("g","12");
            s = s.replace("h","13");
        }
        return s;
    }
}

