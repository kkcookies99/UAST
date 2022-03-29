class Solution {
public:
    int XXX(vector<int>& height) {
        //记录最大值
        int maxA = 0;
        // 数组的起始位置
        auto it = height.begin();
        // 利用缝隙暴力解决
        while(it != height.end()){
            
            // 最大缝隙gap = height.size()-1；主次递减
           for (int i = height.size()-1; i>0; i--){
               // 判断会不会有数组越界
               if(it + i >= height.end()){
                   continue;
               }
               // 保存 
               int left = *it;
               int right = *(it+i);
               // 三元运算符
                int area = (left<right)? i*left:i*right;
                if (maxA<area){
                    maxA = area;
                }

           }

            it++;
        }
        return maxA;

    }
};

