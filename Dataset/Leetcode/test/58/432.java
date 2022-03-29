class Solution {
    public int XXX(String s) {
        int count = 0;
        int index = s.length()-1;
        while(index>=0 && s.charAt(index)==' '){
            index--;
        }
        int j = index;
        while(index>=0 && s.charAt(index)!=' '){
            index--;
        }
        int i = index;

        return j-i;
    }
}

