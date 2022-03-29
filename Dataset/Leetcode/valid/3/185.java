 class Solution {
    public int XXX(String s) {
        //if(s.length()==0)return 0;
        int length = 0;
        HashMap<Character,Integer> t = new HashMap<>();
        for(int i=32;i<=126;i++){
            char c = (char)i;
            t.put(c,-1);
        }
        char s1[] = s.toCharArray();
        int l = 0;
        for(int r=0;r<s1.length;r++){
            if(t.get(s1[r])!=-1){
                l = Math.max(t.get(s1[r])+1,l);
            }
            t.put(s1[r],r);
            int l1 = r-l+1;
            length = (l1>length)?l1:length;
        }
        return length;
    }
}

