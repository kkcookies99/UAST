 class Solution {
    ArrayList<String> result = new ArrayList<String>();
    public void recursion(String s, int open, int close, int n){
        if(open == 0 && close == 0){
            result.add(s);
            return;
        }
        if(open > 0){
            recursion(s + "(", open-1, close, n);
        }
        // 字符串中的 ( 要比 ) 多
        if(n-open > n-close){
            recursion(s + ")", open, close-1, n);
        }
    }
    public List<String> XXX(int n) { 
        String cur_string = "(";
        int open = n-1;
        int close = n;
        recursion(cur_string, open, close, n);
        return result;
    }
}

