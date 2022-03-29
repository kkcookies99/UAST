 public List<String> XXX(int n) {
        List<String> res=new ArrayList<>();
        if(n==1){
            res.add("()");
            return res;
        }
        List<String> resPre=XXX(n-1);
        for(int k=0;k<resPre.size();k++){
            String str=resPre.get(k);
            int index=str.indexOf(")",0);
            while(index!=-1){
                StringBuilder sb=new StringBuilder();
                sb.append(str.substring(0,index)).append("()").append(str.substring(index));
                if(!res.contains(sb.toString())){
                res.add(sb.toString());
                }
                index=str.indexOf(")",index+1);
            }
            StringBuilder sb=new StringBuilder();
            sb.append(str).append("()");
            if(!res.contains(sb.toString())){
            res.add(sb.toString());
            }
        }
    return res;
    }

