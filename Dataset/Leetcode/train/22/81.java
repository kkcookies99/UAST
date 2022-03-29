 class Solution {
    public List<String> XXX(int n) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        dfs(list,sb,n,n);
        return list;
    }

    /**
        left、right表示剩余的左、右括号数。
     */
    public void dfs(List<String> list,StringBuilder sb,int left,int right){
        //终止条件
        if(left==0&&right==0){
            list.add(sb+"");
            return;
        }

        //如果剩余的左右括号数相同，则必须要以左括号开始。
        if(left==right){
            sb.append("(");
            dfs(list,sb,left-1,right);
            sb.deleteCharAt(sb.length()-1);
        }else{
            if (right>0) {
                sb.append(")");
                dfs(list,sb,left,right-1);
                sb.deleteCharAt(sb.length()-1);
            }

            if(left>0){
                sb.append("(");
                dfs(list,sb,left-1,right);
                sb.deleteCharAt(sb.length()-1);
            }
        }
        
    }
}

