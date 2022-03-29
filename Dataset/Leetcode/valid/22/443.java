 public List<String> XXX(int n) {
    res=new LinkedList<>();
    map=new HashMap<>();
    map.put("(",n);
    map.put(")",n);
    backtrack(0,0,new String(""));
    return res;
}
//left表示用到了多少个左括号，right表示用到了多少个右括号
private void backtrack(int left,int right,String track){
    //base case
    if(map.get("(")==0 && map.get(")")==0){
        res.add(track);
        return;
    }
    //判断不合理情况
    if(left<right){
        return;
    }
    
    if(map.get("(")>0){
        //做选择
        map.put("(",map.get("(")-1);
        backtrack(left+1,right,track+"(");
        //撤销选择
        map.put("(",map.get("(")+1);
    }
    if(map.get(")")>0){
        //做选择
        map.put(")",map.get(")")-1);
        backtrack(left,right+1,track+")");
        //撤销选择
        map.put(")",map.get(")")+1);
    }
    return;

}

