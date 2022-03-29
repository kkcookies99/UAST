 class Solution {
    public List<String> XXX(int n) {
        List<String> list = new ArrayList<>();
        if(n == 0) return list;
        StringBuilder sb = new StringBuilder();
        core(list, sb, n, n, 0); // 递归
        return list;
    }
    
    private void core(List<String> buffer, StringBuilder sb, int l, int r, int stack){
        if(stack == 0 && r == 0 && l == 0){ // 栈已空，且所有括号都用完，输出结果
            buffer.add(sb.toString());
            return;
        }
        
         if( l > 0){ // 入栈 
            sb.append('(');
            core(buffer,sb,l-1,r,stack+1);  // 栈元素加1，左括号用掉1个
            sb.deleteCharAt(sb.length()-1);
        }
        
        if(stack > 0 && r > 0){ // 匹配栈内的左括号，出栈
            sb.append(')');
            core(buffer,sb,l,r-1, stack-1);  // 匹配，栈元素减1，右括号用掉1个
            sb.deleteCharAt(sb.length()-1);
        }        
    }
}

