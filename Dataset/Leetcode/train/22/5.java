  public List<String> XXX(int n) {
        List<String> list = new ArrayList<>();
        List<String> res = new ArrayList<>();
         if (n==1) {
            res.add("()");
            return res;
        }
        for (int i = 0; i < n*2; i++) {
            list.add("()");
        }
        List<String> cur = new ArrayList<>();
        backtrace(list,0,cur,res);
        return res;
    }

     private void backtrace(List<String> list, int index, List<String> cur, List<String> res) {
        if (index==list.size()){
            String s = "";
            for (int i = 0; i < cur.size(); i++) {
                s+=cur.get(i);
            }
            if (isValid(s)){
                res.add(s);
            }
           // System.out.println(s);
            return;
        }
        String str = list.get(index);
        for (int i = 0; i < str.length(); i++) {
            cur.add(str.charAt(i)+"");
            backtrace(list,index+1,cur,res);
            cur.remove(index);
        }
    }


     private  boolean isValid(String s) {
        if (s.startsWith(")")) return false;
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
                String c = s.charAt(i)+"";
                if (i==0){
                    stack.push(c);
                }else {
                    if (stack.isEmpty()){
                        stack.push(c);
                        continue;
                    }
                    String top = "";
                    try{
                         top = stack.peek();
                    }catch (Exception e){
                        System.out.println("异常串："+s);
                        e.printStackTrace();
                    }
                    if ("(".equals(top)&&")".equals(c)){
                        stack.pop();
                    }else {
                        stack.push(c);
                    }
                }
        }
        if (stack.isEmpty()){
            return true;
        }else {
            return false;
        }

    }

