 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> p = new ArrayList<>();
        for(int i =1;i<=numRows;i++){
            List<Integer> path = new ArrayList<>();
            for(int j = 0;j<i;j++){
                if(j == 0||j==i-1){
                    path.add(1);
                }else{
                    path.add(p.get(j)+p.get(j-1));
                }
            }
            p = path;
            ans.add(path); 
        }
        return ans;
    }

}


