 public List<String> XXX(int n) {
        List<String> list=new ArrayList<>();
        char[] str=new char[2*n];
        traceBack(0,0,str,n,0,list);
        return list;
    }
    public boolean traceBack(int left, int right, char[] str, int n, int idx, List<String> list){
        if(right>left)
            return false;
        if(idx==0) {
            str[idx++] = '(';
            ++left;
        }
        if(left==right&&left==n){
            list.add(new String(str));
        }
        if(left<n) {
            str[idx] = '(';
            traceBack(left+1, right, str, n, idx+1, list);
        }
        if(right<n&&right<left) {
            str[idx] = ')';
            traceBack(left, right+1, str, n, idx+1, list);
        }
        return true;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


