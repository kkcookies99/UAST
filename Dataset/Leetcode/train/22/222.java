   public List<String> XXX(int n) {
        List<String> result=new ArrayList<>();
        if (n<=0){
            return result;
        }else if(n==1){
            result.add("()");
            return result;
        }
        StringBuilder builder=new StringBuilder();
        for (int i=0;i<n;i++){
            builder.append('(');
        }
        for (int i=0;i<n;i++){
            builder.append(')');
        }
        result.add(builder.toString());
        calculate(n,builder.toString(),result);
        return result;
    }

    protected void calculate(int n,String s,List<String> result){
        char[] chars = s.toCharArray();
        for (int i=0;i<2*n;i++){
            char temp=chars[i];
            for (int j=0;j<2*n;j++){
                if (temp==chars[j]){
                    continue;
                }
                chars[i]=chars[j];
                chars[j]=temp;
                String matchStr = new String(chars);
                if (!result.contains(matchStr)&&checkIsMatch(matchStr)){
                    result.add(matchStr);
                    calculate(n,matchStr,result);
                }
                chars[j]=chars[i];
                chars[i]=temp;
            }
        }
    }

    protected boolean checkIsMatch(String s){
        if (s.length()<2){
            return false;
        }
        boolean f;
        Stack<Character> stack=new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = chars.length-1; i >=0; i--) {
            if (chars[i]==')')
            {
                stack.push(chars[i]);
            }else if (chars[i]=='('){
                if (stack.isEmpty()||stack.peek()=='('){
                    return false;
                }else {
                   stack.pop();
                }
            }
        }
        if (stack.isEmpty()){
            f=true;
        }else {
            f=false;
        }
         return f;
    }

