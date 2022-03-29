class Solution {
    public String XXX(int n) {
        if(n==1) return "1";
        String last = XXX(n-1);
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int l = 0;
        int r = 0;
        while (r < last.length()){
            if (last.charAt(l) == last.charAt(r)){
                ++count;
                ++r;
            }else{
                sb.append(count);
                sb.append(last.charAt(l));
                count = 1;
                l = r;
                ++r;
            }
        }
        if (count > 0){
            sb.append(count);
            sb.append(last.charAt(l));
        }
        return sb.toString();
    }
}```

