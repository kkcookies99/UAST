 public List<String> XXX(int n) {
        List<String>res=new ArrayList<>();
        back(res,new StringBuilder(),n*2,n);
        return res;
    }
    private void back(List<String>res,StringBuilder sb,int n,int count){
        //这里的n指结果长度 count指剩余（个数
        if(sb.length()==n){
            res.add(sb.toString());
            return;
        }
        //回溯 某个下标 只要（还有剩余 总是可以在这个地方放一个(
        if(count>0){
            sb.append("(");
            back(res,sb,n,count-1);
            sb.deleteCharAt(sb.length()-1);
        }
        //只要当前sb中（个数 > )个数  总是可以放一个 )
        //n 总长度 count剩余的个数 sb.length() 已经有的个数 n/2-count  *2>sb.length()
        //n>sb.length()+count*2
        if(n>sb.length()+count*2){
            sb.append(")");
            back(res,sb,n,count);
            sb.deleteCharAt(sb.length()-1);
        }
    }

