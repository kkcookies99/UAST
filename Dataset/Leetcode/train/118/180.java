 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        if(numRows<=0)
            return result;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        for(int i=0;i<numRows;i++)
        {
            List<Integer> list =new ArrayList<>();
            if(!queue.isEmpty())
            {
                int n=0;
                 for(int j=0;j<queue.size();j++)
                 {
                   int n1=queue.poll();
                     n+=n1;
                     queue.add(n);
                     list.add(n);
                     n=n1;
                 }
            }
            
                if(i>0)
                {list.add(1);
                 queue.add(1);}
                result.add(list);
        }
        return result;
        }
}

