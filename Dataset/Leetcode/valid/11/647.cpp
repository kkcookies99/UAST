 class Solution {
public:
    int XXX(vector<int>& height) {
        //双指针缩减搜索空间
        int maxarea = 0, area = 0;
        int i = 0;
        int j = height.size() - 1;
        while(i<j)
        {
            area = (j-i) * min(height[i], height[j]);
            maxarea = max(maxarea, area);
            if(height[i] < height[j])
            //如果第一根柱子较短，那么2~（j-1）根柱子与第一根围成的面积必小于1与j根柱子的面积
            //因为第一根柱子短，决定了其高度，若想面积最大，则需要宽度最大
            //因此不用再考虑1与其他柱子的组合,需要i++
            {
                i++;
            }
            else
            //与之相对，若j较短，则1与j所形成的的面积必定大于2~j-1中柱子与第j根柱子所围成的面积
            //故不用考虑j与其他柱子的组合，需要j--
            {
                j--;
            }
        }
        return maxarea;
    }
};

