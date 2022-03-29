 class Solution {
    public List<String> XXX(int n) {
        Set<String> result = new HashSet<>();
        String start = "";
        for(int i = 0;i < n;i++){
            start = start + "()";
        }
        Deque<String> path = new ArrayDeque<>();
        boolean[] visit = new boolean[2*n];
        dfs(path,visit,result,start,n,0,0,0);
        List list = new ArrayList(result);
        return list;
    }

    private void dfs(Deque<String> path,boolean[] visit,Set<String> result,String start,int n,int end,int left,int right){
        if(end == 2*n){
            String a = "";
            String s = "";
            for(int i = 0;i< 2*n;i++){
                 s = path.removeFirst();
                 a = a + s;
                 path.addLast(s);
            }
            result.add(a);
            left = right =0;
            return;
        }
        for(int i = 0; i < 2*n;i++){
            if(visit[i]) continue;
            if(start.charAt(i) == '(') left += 1;
            else left -= 1;
            if(left < 0) continue;
            visit[i] = true;
            path.addLast(String.valueOf(start.charAt(i)));
            dfs(path,visit,result,start,n,end + 1,left,right);
            path.removeLast();
            visit[i] = false;
            if(start.charAt(i) == '(') left -= 1;
            else left += 1;
        }
    }
}

