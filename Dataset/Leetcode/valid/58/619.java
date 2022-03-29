class Solution {
    public int XXX(String s) {
        int count = 0;
        int index = s.length()-1;
        while (index>0){
            if(s.charAt(index)==' ')
                index--;
            else break;
        }
        
        for (int i = index; i >=0 ; i--) {
            if(s.charAt(i)!=' ')
                count++;
            else break;
        }
        return count;
    }
}

