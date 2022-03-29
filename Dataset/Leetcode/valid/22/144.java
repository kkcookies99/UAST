 class Solution {
    public List<String> XXX(int n) {
        // 全排序、回溯
        List<String> list = new ArrayList<>();
        StringBuffer buffer = new StringBuffer();
        // 左面括号、右面括号
        backtrace(buffer, n, n, list);
        return list;
    }

    void backtrace(StringBuffer buffer, int left, int rigth, List<String> list){
        // 结束条件
        if(left == 0 && rigth == 0){
            list.add(buffer.toString());
            return;
        }else if(left > rigth){
            // 将重复的去掉
            return;
        }
        
        // 回溯
        if(left > 0){
            buffer.append("(");
            backtrace(buffer, left - 1, rigth, list);
            buffer.deleteCharAt(buffer.length() - 1);
        }
        
        if(rigth > 0){
            buffer.append(")");
            backtrace(buffer, left, rigth - 1, list);
            buffer.deleteCharAt(buffer.length() - 1);
        }
    }
}

