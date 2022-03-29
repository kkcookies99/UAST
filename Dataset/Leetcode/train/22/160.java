 class Solution {
    public List<String> XXX(int n) {
        List<String> res = new ArrayList<>();
        supportClass buf = new supportClass();
        Stack<supportClass> s = new Stack<>();
        buf.s.append('(');
        buf.left++;
        s.push(buf);
        while(!s.empty()){
            buf = s.pop();
            //左括号总数
            int sum = buf.left+buf.n;
            if(buf.n==n) {
                res.add(buf.s.toString());
                continue;
            }
            if(buf.left==0){
                buf.s.append('(');
                buf.left++;
                s.push(buf);
            }
            else if(buf.left>0){
                supportClass buf2 = buf.copy();
                buf.s.append(')');
                buf.left--;
                buf.n++;
                s.push(buf);
                if(sum<n){
                    buf2.s.append('(');
                    buf2.left++;
                    s.push(buf2);
                }
            }
        }
        return res;
    }
}

class supportClass{
        public StringBuilder s;
        //未匹配左括号数
        public int left;
        //已匹配括号的对数
        public int n;
        public supportClass(){s = new StringBuilder();left=0;n=0;}
        public supportClass copy(){
                supportClass res =new supportClass();
                res.left = this.left;
                res.n = this.n;
                res.s = new StringBuilder(this.s.toString());
                return res;
        }  
}

