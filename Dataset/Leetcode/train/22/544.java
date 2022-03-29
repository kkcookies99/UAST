 class Solution {
    public List<String> XXX(int n) {
        List<String> res = new ArrayList<>();
        backTrack(n,n,new StringBuilder(),res);
        return res;
    }

    public void backTrack(int left,int right,StringBuilder track,List<String> res){
        if(left<0 || right<0){
            return;
        }
        if(left>right){
            return;   //已使用的左括号数量必须小于等于有括号，否则是非法的括号。
        }
        if(left == 0 && right==0){
            res.add(track.toString());  //括号全部生成，加入结果集
            return;
        }
        track.append("(");   //先左
        backTrack(left-1,right,track,res);   
        track.deleteCharAt(track.length()-1);  //回溯算法记得取消本次选择。

        track.append(")");  //后右
        backTrack(left,right-1,track,res);
        track.deleteCharAt(track.length()-1);
    }
}

