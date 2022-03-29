 class Solution {
    public List<String> XXX(int n) {
        List<String> res = new ArrayList<String>();
        StringBuilder temp = new StringBuilder();
        int num_left = 0,num_right = 0;
        generate_do(res,temp,n,num_left,num_right);
        return res;
    }
    int cur_len = 0;
  
    private void generate_do(List<String> res, StringBuilder temp, int n,int num_left,int num_right){
        if(num_left == n && num_right == n){
            res.add(temp.toString());
            return;
        }
        if(num_left<n){
            temp.append('(');
            generate_do(res,temp,n,num_left+1,num_right);
            temp.deleteCharAt(temp.length()-1);
        }
        if(num_right<num_left){
            temp.append(')');
            generate_do(res,temp,n,num_left,num_right+1);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}

