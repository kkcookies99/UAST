 class Solution {
    List<String> list = new ArrayList<>();
    public List<String> XXX(int n) {
        get("",2*n,0,n);
        return list;
    }

    public void get(String cur,int n,int res,int length){
        if (res > length || res < 0 || check(cur, length)){
            return;
        }
        if (res == 0 && n == 0){
            list.add(cur);
        }
        get(cur+"(",n-1,res+1,length);
        get(cur+")",n-1,res-1,length);
    }

    public boolean check(String cur,int n){
        String s = cur.replaceAll("\\(", "");
        String s1 = cur.replaceAll("\\)", "");
        if (cur.length()-s.length() > n || cur.length()-s1.length() > n){
            return true;
        }
        return false;
    }
}

