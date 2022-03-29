 class Solution {

    public static List<String> XXX(int n) {
        List<String> re = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.add(0,"(");
        list.add(1, ")");
        insert(n,1,list, re);
        return re;
    }

    public static void insert (int n , int start , List<String> list, List<String> re){
        if(start == n){
            //处理一下显示的效果！
            String del1 = String.valueOf(new ArrayList<String>(list)).replace(", ", "");
            String del2 = del1.replace("[", "");
            String del3 = del2.replace("]", "");
            if(!re.contains(del3)){
                re.add(del3);
            }
            return ;
        }

        for(int i=0;i< (list.size() / 2) + 1 ; i++){
            int center = list.size() / 2 + i;
            if (center == list.size() || !"(".equals(list.get(center)))
            {
                list.add(center,"(");
                list.add(center + 1, ")");
                insert(n,start+1,list, re);
                list.remove(center + 1);
                list.remove(center);
                                              
            }
        }
    }
}

