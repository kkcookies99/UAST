 class Solution {
    public List<String> XXX(int n) {
        List<String> result = new ArrayList<>();
        dfs("",0,0,n,result);
        return result;

    }
    //dfs+剪枝
    public void dfs(String str, int left, int right, int n, List<String> result){
        //str+"字符串"其实这里是新new了对象。如果使用StringBuilder，应该采用new StringBuilder对象,同时这里就可以采用回溯法。
        if(left==n && right==n){
            result.add(str);
            return;
        }
        //当用的左括号的数量小于右括号时，剪枝
        if(left<right){
            return;
        }
        //还有左括号可以使用时
        if(left<n){
            dfs(str+"(",left+1,right,n,result);
        }
        //还有右括号可以使用时
        if(right<n){
            dfs(str+")",left,right+1,n,result);
        }
    }
}

