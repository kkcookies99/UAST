 class Solution {
    public List<String> XXX(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) stringBuilder.append('(');
        HashMap<String, Integer> set = new HashMap<>();
        backGenerate(n,n,res,stringBuilder,set);
        return res;
    }
    private void backGenerate(int cur, int n, List<String> strings, StringBuilder stringBuilder, HashMap<String, Integer> set) {
        if(cur == 0) {
            if(!set.containsKey(stringBuilder.toString())) {
                set.put(stringBuilder.toString(),cur);
                strings.add(stringBuilder.toString());
            }
            return;
        }
        for(int i = cur; i <= n; i++) {
            stringBuilder.insert(i,')');
            backGenerate(cur -  1, n, strings, stringBuilder, set);
            stringBuilder.deleteCharAt(i);
        }
    }

}

