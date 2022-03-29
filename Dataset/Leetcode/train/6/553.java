 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows==1 || s.length()<=1) return s;
        List<List<Character>> list = new ArrayList<>();
        for(int i = 0 ; i < numRows ; i ++){
            list.add(new ArrayList<>());
        }
        int len = s.length();
        int row= numRows-1;
        for(int i = 0 ; i < len ; i++ ){
            int a = i%row;
            int b = i/row;
            if(b%2==0){
                list.get(a).add(s.charAt(i));
            }
            else if(a==0 && b%2!=0){
                list.get(row).add(s.charAt(i));
            }
            else if(a!=0 && b%2!=0){
                list.get(row-a).add(s.charAt(i));
            }
        }
        StringBuffer res = new StringBuffer();
        for(int i = 0 ; i < numRows ; i++){
            int size  = list.get(i).size();
            for(int j = 0 ; j < size ; j++){
                res.append(list.get(i).get(j));
            }
        }
        String ans = res.toString();
        return ans;
    }
}

