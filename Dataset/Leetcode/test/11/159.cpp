class Solution {
public:
    int XXX(vector<int>& height) {
     //int n=height.size();
     int s,area=0;
     int pl=0,pr=height.size()-1;
     while(pl<pr){
         s=min(height[pl],height[pr])*(pr-pl);
         area=max(area,s);
         height[pl]<height[pr]?pl++:pr--;
     }
     return area;
    }
};

