 class Solution {
    public int XXX(int x) {
        int XXX = 0;
        int temp; 
        if(x != 0){
            //123
            while(x != 0){
                temp = XXX;//定义一个判断量，来看是否整形溢出
                XXX *= 10;
                XXX += x % 10;
                x /= 10;
                if(temp != (XXX / 10)){//整形溢出
                    return 0;
                }
            }
            return XXX;

        }
        return 0;
    }
}

