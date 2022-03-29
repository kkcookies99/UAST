 class Solution {
    public List<String> XXX(int n) {
        List<String> ans = new ArrayList<>();
        Set<String> set = new HashSet<>();
        dfs(set, "()", n);
        ans.addAll(set);
        return ans;
    }

    public void dfs(Set<String> set, String tmp, int n){
        if(tmp.length() == n * 2){
            set.add(tmp);
            return;
        }
        for(int i = 0; i < tmp.length(); i++){
            String old = tmp;
            tmp = old.substring(0, i) + "()" + old.substring(i);
            dfs(set, tmp, n);
            tmp = old;
        }
    }
}

