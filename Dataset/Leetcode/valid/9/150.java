class Solution {
    public boolean XXX(int x) {
        if(x<0) return false;
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        while(x!=0){
            int t = x%10;
            stack.push(t);
            queue.offer(t);
            x=(x-t)/10;
        }
        
        int num=0;
        while(!stack.empty()){
            int tem = stack.pop();
            if(tem!=queue.poll())
                return false;
        }
        return true;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

