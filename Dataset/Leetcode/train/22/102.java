 class Solution {
    public List<String> XXX(int n) {
        List<String> res = new ArrayList();
        String temp = "()";
        StringBuilder sb =new StringBuilder();
        res.add(temp);
        for(int i=1;i<n;i++){
            int len = res.size();
            for(int j=0;j<len;j++){
                sb.append(res.get(0));
                int size =sb.length();
                for(int k=0;k<size;k++){
                    sb.insert(k,temp);
                    if(!res.contains(sb.toString())) res.add(sb.toString());
                    sb.delete(k,k+2);
                }
                res.remove(0);
                sb.setLength(0);
            }
        }
        return res;
    }
}

