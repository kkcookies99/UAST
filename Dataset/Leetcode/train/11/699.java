 class Solution {
    public int XXX(int[] height) {
        int[] copy = height.clone();
        Arrays.sort(copy);
        int count=0,maxV=0,i=0,j=height.length-1;
        while(i<j&&count<copy.length){       //由于排序了，复杂度为O(n2)，跟最高的柱子无关
            int h=copy[count++];
            while(height[i]<h)
                i++;
            while(height[j]<h)
                j--;
            maxV=Math.max(maxV,(j-i)*h);
        }
        return maxV;
    }
}

