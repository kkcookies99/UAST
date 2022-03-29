 public List<String> XXX(int n) {
        List<String> temp = new ArrayList<>();
        getStr(temp,n,n,"");
        return temp;
    }
    
    private void getStr(List<String> strs,int left,int right,String str){
        if(left == 0 && right == 0){
            strs.add(str);
        }
        if (left > right) {
            return;
        }
        if(left>0){
            getStr(strs,left-1,right,str+"(");
        }
        if(right>0){
            getStr(strs,left,right-1,str+")");
        }
    }

