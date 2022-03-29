class Solution {
    public int XXX(int[] height) {
        /*
            V=min(height[a],height[b])  * (b-a)
            开始时取b-a最大此时面积为V1
            有上面的公式可以看出,若b-a减少要使得V增大则min(height[a],height[b])必须要增大。
            所以需要移动height[a],height[b]中较小的那一个直到找到比小的那个高的柱子，再来计算并于V1比较取两者大的，
            多次按上述步骤直到b-a=0;
        */
        int a=0;
        int b=height.length-1;      
        int max_V=0;
        while(a<b){
            int lowheight=Math.min(height[a],height[b]);
            int V=(b-a)*lowheight;
            max_V=Math.max(max_V,V);
            while(a<b && height[a]<=lowheight) a++;
            while(a<b && height[b]<=lowheight) b--;
        }

        return max_V;
    }
}

