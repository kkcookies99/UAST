 class Solution {
    public List<String> XXX(int n) {
        List<String> ans = new ArrayList<>();
        char[] map = new char[]{'(',')'};
        int[] count = new int[]{n,n};
        dfs(n*2,map,count,new StringBuilder(),ans);
        return ans;
    }
    
    void dfs(int signal,char[] map,int[] count,StringBuilder str,List<String> ans){
        if(str.length() == signal){
            ans.add(str.toString());
            return;
        }
        if(count[0] > 0){
            count[0]--;
            str.append(map[0]);
            dfs(signal,map,count,str,ans);
            str.deleteCharAt(str.length()-1);
            count[0]++;
        }
        if(count[1] > 0 && count[0] != count[1]){
            count[1]--;
            str.append(map[1]);
            dfs(signal,map,count,str,ans);
            str.deleteCharAt(str.length()-1);
            count[1]++;
        }
    }
}```

