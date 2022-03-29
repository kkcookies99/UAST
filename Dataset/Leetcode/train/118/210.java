 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        //创建一个集合储存结果
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        //最外层循环为杨辉三角的层数
        for(int i=1;i<=numRows;i++){
            //创建一个集合存储每层的数值
            List <Integer> list1=new ArrayList<Integer>();
            list1.add(1);
            //如果是第一层直接将元素值加入集合然后将集合加入到list中去
            if(i==1){              
                list.add(list1);
                continue;
            }
            for(int j=1;j<i-1;j++){
                //注意这个地方，一定要声明泛型，不然它无法进行自动拆箱操作
                //其次就是这个i-2的一定要想清楚避免越界
               List<Integer> temp=list.get(i-2);
               int b=temp.get(j);
               int a=temp.get(j-1);
               list1.add(a+b);
            }
            list1.add(1);
            list.add(list1);
        }
        return list;
    }
}

