 public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> result=new ArrayList(numRows);
   
        for(int i=0;i<numRows;i++){
            List<Integer> list=new ArrayList();
            list.add(1);//第一个为1
            if(i>0){//从第二行开始逻辑判断
                List<Integer> preList=result.get(i-1);
                for(int j=1;j<i;j++){
                    list.add(preList.get(j-1)+ preList.get(j));
                }
                list.add(1);//最后一个为1
            }      
            result.add(list);
        }
        return result;
    }

