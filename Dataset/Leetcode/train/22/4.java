 public List<String> XXX(int n) {
        List<String> res=new ArrayList<String>();
        if(n==1){
            res.add("()");
            return res;
        }
        //回溯算法？
        StringBuilder sb=new StringBuilder();
        //int i=0,j=0;
        gp(res,sb,0,0,n);
        return res;
    }
    public void gp(List<String> list,StringBuilder sb,int i,int j,int n){
        if(i+j==2*n)
        {
            list.add(sb.toString());
            return;
        }
        if(i!=n){
            sb.append('(');
            gp(list,sb,i+1,j,n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(i>j){
            sb.append(')');
            gp(list,sb,i,j+1,n);
            sb.deleteCharAt(sb.length()-1);
        }
    }

