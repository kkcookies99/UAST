 public List<String> XXX(int n) {
        if(n <= 0)
            return new ArrayList<>();
        List<String> res = new ArrayList<>();
        build(res,"",n,n);
        return res;
    }
    //ans 每次循环的字符串
    //left 左括号使用次数
    //right 右括号使用次数
    private void build(List<String> list,String ans,int left,int right){
        if(left < 0 || right < 0) //左括号或右括号用超支了，直接退出
            return;
        if(left == 0 && right == 0) //左右括号都刚好用完了，返回结果
            list.add(ans);
        if(left <= right){  //左括号用的多，可以接着用左括号或右括号，否则退出
            build(list,ans+"(",left - 1,right);
            build(list,ans+")",left,right - 1);
        }
    }

