 class Solution {
    public int XXX(String s) {
        if(s.isEmpty()){
            return 0;
        }
        int x = 0, j = 0, i;
        int length = s.length();
        int max[] = new int[length + 1];
        Set<Character> set = new HashSet<>();
        for (i = 0; i <length; i++) {
            set.add(s.charAt(i));
            x++;
            if (x != set.size()) {
                max[j] = set.size();
                i = j;
                j++;
                x = 0;
                set.clear();
            }
            if(i==length-1){
                max[j] = set.size();
                x=0;
            }
        }

        for (int k = 0; k < max.length; k++) {
            if(max[k]>x){
                x=max[k];
            }
        }
        return x;
    }
}

