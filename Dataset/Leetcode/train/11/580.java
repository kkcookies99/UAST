 class Solution {
    public int XXX(int[] height) {
int Max=0;
		  for (int i = 0; i < height.length; i++) {
			  int  min=0;	
			  int  l=0;
			for (int j2 = i+1; j2 < height.length; j2++) {
				min=height[i]<height[j2]?height[i]:height[j2];
				l=j2-i;
				Max=l*min>Max?l*min:Max;
			
			}
		}
		   
		   
		   return Max;
    }
}


