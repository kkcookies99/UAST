 class Solution {
    public int XXX(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int max = 0;
        for(int i=0;i<s.length();i++) {
        	if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i))>=start) {
        		start = map.get(s.charAt(i))+1;
        	}else{
                        max = Math.max(max, i - start + 1);
                }
        	map.put(s.charAt(i), i);
        }
        return max;
    }
}

