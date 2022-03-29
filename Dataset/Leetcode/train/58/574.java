class Solution {
    public int XXX(String s) {
        int start = -1;
        int end = -1;
        for(int i = s.length()-1;i >= 0;i--) {
            if(s.charAt(i) != ' ' && end == -1) {
                end = i;
                continue;
            }
            if(s.charAt(i) == ' ' && end != -1) {
                start = i;
            }
            if(end != -1 && start != -1) {
                break;
            }
        }
        return end-start;
    }
}

