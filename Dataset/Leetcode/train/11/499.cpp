 class Solution {
public:
    int XXX(vector<int>& height) {
    	int num_length = height.size(), max = 0,water_max, water_new,ans;
    	int kk[num_length-1][2];
    	int height_one = 0,i,j;
    	for (i = 0; i <= num_length-2; i++) {
    		kk[i][0] = i+1;
			kk[i][1] = 0;
			water_max = 0;
			for (j = i+1; j <= num_length-1; j++ ){
			//取二者中的较小值，作为高度 
            	height_one = height[i] < height[j]?height[i] : height[j];
				water_new = height_one * (j-i);
				water_max = water_max>water_new? water_max:water_new;			
			}
			kk[i][1] = water_max;
		}
	   	ans = kk[0][1];
		for (i = 1; i<num_length-1;i++){
			if (kk[i][1] > ans){ 
				ans = kk[i][1];	
			}	 
		}
    	return ans;
    }
};


