class Solution {
public:
    int XXX(int x) {
        for(int i=0;i<=46339;i++){
            if(i*i==x){
                return i;
            }
            else if(i*i<x && (i+1)*(i+1)>x){
                return i;
            }
        }
        //2的32次方-1 再开方是46340.9 上面46340的平方都比x小 说明只能是取整就是46340 小数省略
        return 46340;
    }
};

