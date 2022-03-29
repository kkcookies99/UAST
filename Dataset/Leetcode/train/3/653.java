 class Solution {
    public int XXX(String s) {
      if (s.isEmpty()) return 0;
      if (s.length() == 1) return 1;
      int res = 1,max = 0;
      Map<Character,Integer> mm = new HashMap<>();
      mm.put(s.charAt(0),0);
      for (int i = 1; i < s.length();i++){
        if (!mm.containsKey(s.charAt(i))) res++;
        else {
          if (mm.get(s.charAt(i)) < i - res) res++;
          else res = i - mm.get(s.charAt(i));
        }
        mm.put(s.charAt(i),i);
        max = Math.max(res,max);
      }
      return max;
    }
}

