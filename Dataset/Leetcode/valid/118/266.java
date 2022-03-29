 public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        // 先准备第一行
        List<Integer> list = new ArrayList<>();
        list.add(1);
        lists.add(list);
        for(int i = 2;i <= numRows;++i){
            // 从lists集合中提取上一行
            list = new ArrayList<>(lists.get(i-2));
            // 计算倒数第二个到第二个的数(从后往前算才不会混乱)
            for(int j = i-2;j > 0;--j){
                list.set(j,list.get(j-1)+list.get(j));
            }
            // 添加最后的1
            list.add(1);
            // 添加list集合到lists集合中
            lists.add(list);
        }
        return lists;
    }

