 class Solution {
    public int calculate(ArrayList<Integer> list, int flag){
        int r = 0;
        int max_value = Integer.MAX_VALUE / 10;
        int min_value = Integer.MIN_VALUE / 10;
        for(int i = 0; i < list.size(); i++){
            int next = flag * list.get(i); 
            if(r > max_value || (r == max_value && next > 7))
                return Integer.MAX_VALUE;
            if(r < min_value ||(r == min_value && next < -8))
                return Integer.MIN_VALUE;
            r = next + r*10;
        }
        return r;
    }
    public int XXX(String str) {
        long r = 0;
        ArrayList<Integer> list =new ArrayList<Integer>();
        boolean first = true;
        int flag = 1;
        for(int i =0; i < str.length(); i++){
            //find first valid character
            char ch = str.charAt(i);
            if(first){
                if(ch != ' '){
                    if(ch == '-'){
                        flag = -1;
                    }
                    else if(ch == '+'){
                        
                    }
                    else if(Character.isDigit(ch)){
                        list.add(ch - 48);
                    }
                    else 
                        return 0;
                    first = false;
                }
            }
            else {
                if(!Character.isDigit(ch))
                    return calculate(list, flag);
                else{
                    list.add(ch - 48);
                }
            }
        }
        return calculate(list, flag);
    }
}

