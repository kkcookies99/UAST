 class Solution {
    public int XXX(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        int maxlen = 0;
        int start = 0;
        Map<Object, Integer> map = new HashMap();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            Integer value = map.get(ch);
            int prePos = value == null ? 0 : (value + 1);
            if(start < prePos) {
                start = prePos;
            }
            int curlen = i + 1 - start;
            if(maxlen < curlen) {
                maxlen = curlen;
            } 
            map.put(ch, i);
        }
        return maxlen;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


