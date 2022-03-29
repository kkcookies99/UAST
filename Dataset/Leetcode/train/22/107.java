 class Solution {
    public List<String> XXX(int n) {
        Set<String> s = new HashSet<>();
        s = generate(n);
        List<String> l = new LinkedList<>(s);
        return l;
    }
    public Set<String> generate(int n){
        if(n == 1){
            Set<String> s = new HashSet<>(Arrays.asList("()"));
            return s;
        }else{
            Set<String> s = generate(--n);
            Set<String> newS = new HashSet<>();
            for(String str:s){
                System.out.println(str);
                newS.add("()"+str);//插在左边
                newS.add("("+str+")");//插在中间
                newS.add(str+"()");//插在右边
            }
            return newS;
        }
    }
}

