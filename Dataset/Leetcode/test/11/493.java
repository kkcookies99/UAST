 class Solution {
    public int XXX(int[] height) {
        int i=0,j=height.length-1;
        ArrayList<Integer> arr=new ArrayList();
        while(i<=j)
        {
            if(height[i]<=height[j]){
              int   res=(j-i)*Math.min(height[i],height[j]);
                arr.add(res);
                i++;
            }
            else{
             int    res=(j-i)*Math.min(height[i],height[j]);
                arr.add(res);
                j--;
            }

        }
        Collections.sort(arr);
        return arr.get(arr.size()-1);
    }
}

