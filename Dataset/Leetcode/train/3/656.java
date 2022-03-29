 class Solution {
    public int XXX(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        char[]chs=s.toCharArray();
        int n=chs.length,maxLen=0,start=-1;
        if(n<2) return n;
        for(int i=0;i<n;i++){
            if(map.containsKey(chs[i])){
                start=Math.max(start,map.get(chs[i]));
            }
            maxLen=Math.max(i-start,maxLen);
            map.put(chs[i],i);
        }
        return maxLen;
    }
}

