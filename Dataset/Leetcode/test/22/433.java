     public List<String> XXX(int n) {
        //创建一个list,保存所有的结果
        List<String> list = new ArrayList<>();
        dfs(n,n,2*n,list,"");
        return list;
    }

    public void dfs(int left,int right,int targetNum,List<String> list,String temp){
        if(temp.length()==targetNum){
            if(checkIsTrue(temp)){
                list.add(temp);
            }
            return;
        }
        if(left>0)dfs(left-1,right,targetNum,list,temp+"(");
        if(right>0)dfs(left,right-1,targetNum,list,temp+")");
    }

    //判断当前字符串括号组是否符合要求
    public boolean checkIsTrue(String temp){
        //把字符串转化为字符数组  方便操作
        char[] arr = temp.toCharArray();
        //创建1个栈 存放左括号
        //分析：如果读到右括号  左括号栈的大小等于0 false
        //每次读到一个右括号  左括号pop
        Stack<Character> leftStack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='('){
                leftStack.push('(');
            }else{
                if(leftStack.size()==0)return false;
                leftStack.pop();
            }
        }
        return true;
    }

