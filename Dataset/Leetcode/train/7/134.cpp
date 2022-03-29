class Solution {
public:
    int XXX(int x) {
        int max[] = {2,1,4,7,4,8,3,6,4,7};
        int input[10] = {0}, i=0, j = 0;
        int pos = x >= 0 ? 0 : 1;
        int count = 0, res = 0;
        if(x == -2147483648) return 0;
        if(pos){
            x = -x; 
            max[9]++;
        }
        while(x){//拆分数据
            input[i++] = x%10;
            x /= 10;
            count++;
        }
        if(count <= 9){
            int pow = 1;
            for (int i = 0; i < count - 1; i++)
            {
                pow *= 10;
            }
            
            for(int i = 0; i < count; i++){
                res += input[i] * pow;
                pow /= 10;
            }
        }else{
            for(int i = 0, flag = 1;flag && i<10;i++){
                //判断数据是否会溢出
                if(input[i] < max[i]){
                    flag = 0;
                }else if(input[i] == max[i]){
                    continue;
                }else{
                    return 0;
                }
            }
            int pow = 1e9;
            for (int i = 0; i < count; i++)
            {
                res += input[i] * pow;
                pow /= 10;
            }
        }
        return pos ? -res : res;
    }
};

