 class Solution {
    public int XXX(String s) {
        int result = 0;
        int length = 0;
        Set<Character> set =new HashSet<Character>();
     for (int i=0;i<s.length();i++) {
        for (int j=i; j < s.length();j++) {
       	    if (set.contains(s.charAt(j))){
        		break;
        	}else {
        		set.add(s.charAt(j));
        	}
        }
            length = set.size();
            if (result < length) {
               result = length;
               //System.out.println("result为:"+result);
            }
            set.clear();
     }
       //System.out.println("result结果为:"+result);
        return result;
    }
}

