 class Solution {

    List<String> res;
    public List<String> XXX(int n) {
        res = new ArrayList<>();
        next(0,new StringBuilder(),0,n);
        return res;
    }

    /**
        index:当前要添加的括号的序号
        unMatch:剩余未匹配的'('的数量
    
     */
    public void next(int index,StringBuilder builder,int unMatch,int n) {
        if(builder.length() == 2*n){
            res.add(builder.toString());
            return;
        }

        
        //当剩余待添加的括号的数量大于未匹配的'('的数量时，可以添加'('
        if(2*n - index > unMatch){
            builder.append('(');
            next(index+1,builder,unMatch+1,n);
            builder.deleteCharAt(index);
        }

        //当未匹配的'('的数量大于0时，可以添加')'
        if(unMatch>0){
            builder.append(')');
            next(index+1,builder,unMatch-1,n);
            builder.deleteCharAt(index);
        }
    }
}

