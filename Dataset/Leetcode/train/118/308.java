     public List<List<Integer>> XXX(int numRows) {
        //返回值
        List<List<Integer>> ret = new ArrayList<>();
        //for循环每次根据上一行生成当前行
        for(int i =0;i<numRows;i++){
            List<Integer> rowi = new ArrayList<>();
            //如果只有1行
            if(i==0){
                rowi.add(1);
            }else{
                //第i+1行 i>=1时，一共i+1个元素
                for(int j=0;j<i+1;j++) {
                    if (j == 0 || j == i) {
                        //左右为1
                        rowi.add(1);
                    } else {
                        //中间时上一行的和
                        rowi.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
                    }
                }
            }
            ret.add(rowi);
        }
        return ret;
    }

