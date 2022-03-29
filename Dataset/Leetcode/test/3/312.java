 class Solution {
    public int XXX(String s) {
        HashMap str = new HashMap();
        int len = 0;
        int max = 0;
        int prevIndex = 0;
        int index = 0;
        for(int i = 0;i<s.length();i++){
            if(str.containsKey(s.charAt(i))){
                index = (int)str.get(s.charAt(i));
                if( index < prevIndex){
                    str.remove(index);
                    str.put(s.charAt(i),i);
                    continue;
                }
                len = i - prevIndex;
                prevIndex = index + 1;
                if( max < len){
                    max = len;
                }
                str.remove(index);
            }
            str.put(s.charAt(i),i);
        }
        len = s.length() - prevIndex;
        if( max < len){
            max = len;
        }
        return max;
    }
}

