 class Solution {
    public List<String> XXX(int n) {
        List<String> result = new ArrayList<>();

        if(n == 0){
            result.add("");
            return result;
        }

        if(n == 1){
            result.add("()");
            return result;
        }

        for(int i=0; i<= n-1 ; i++){
            List<String> left = XXX(i);
            List<String> right = XXX(n-1-i);
            for(int j=0;j<left.size();j++){
                String w = "("+left.get(j)+")";
                for(int k = 0; k<right.size();k++){
                    result.add(w + right.get(k));
                }
            }
        }

        return result;
    }
}

