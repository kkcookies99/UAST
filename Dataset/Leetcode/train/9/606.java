 class Solution {
    public boolean XXX(int x) {
        ArrayList<Integer> array = new ArrayList<>();
        //判断是否为负，若为负直接判断。
        if(x < 0){
            return false;
        }
        
        // 若不为负数，则用数组存储 x 的每一位数字
        while(x!=0){
            array.add(x%10);
            x = x / 10;
        }
        // 若 x 为回文数，那么首尾数字相等，用双指针，一个指向开头，一个指向结尾。判断两者是否相等。
        for(int i=0, j=array.size()-1; i<=j; i++, j--){
            if(array.get(i) == array.get(j)){
                continue;
            }else{
                return false;
            }
        }

        return true;

    }
}

