 class Solution {
    public List<String> XXX(int n) {
        List<String> list=new ArrayList<>();
        char[] strings=new char[2*n];
        dfs(0,strings,list,n,n);
        return list;
    }

    private void dfs(int i, char[] strings, List<String> list,int leftRemain,int rightRemain) {
        if (i==strings.length){
            list.add(new String(strings));
            return;
        }
        if (leftRemain>0){
            strings[i]='(';
            dfs(i+1,strings,list,leftRemain-1,rightRemain);
        }
        if (rightRemain>0&&leftRemain!=rightRemain){
            strings[i]=')';
            dfs(i+1,strings,list,leftRemain,rightRemain-1);
        }
       
    }
}

