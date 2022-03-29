 public List<String> XXX(int n) {
    List<String> result = new ArrayList<String>();
    get("",result,n,n);
    return result;
}

public void get(String list,List<String> result,int left,int right) {
    if(left == 0 && right == 0) {
        result.add(list);
        return;
    }
    if(left > 0) {
        get(list+"(",result,left-1,right);
    }
    if(right > left) {
        get(list+")",result,left,right-1);
    }
}

