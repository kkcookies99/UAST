 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
		int len = nums.size();
		vector<vector<int>>output; //输出vector
        
		if(len<3) return output; //如果nums元素小于3，则返回空
		sort(nums.begin(),nums.end());//元素排序
		
		// 三个元素和为0，排列为升序的话，有两种情况，1.三个元素都为0，2.第一个元素一定为负，第二个，第三个为和为一个元素的绝对值
		// 记录元素值为0的位置，0的个数;记录第一个正值得到位置，作为最后一位的循环起始位
		
		int zero_pos = -1,zero_num=0,right_pos =-1;;
		bool zero_flag =0,right_flag = 0;
		for(int i = 0;i<len;i++)
		{
			if(nums[i] == 0) {
				if(zero_flag == 0) {zero_pos = i;zero_flag=1;}
				zero_num++;
			}
			if(nums[i] > 0 && right_flag == 0) {
				right_pos = i;right_flag=1;
			} 			
		}
		//如果 0 在第一位，且 0的个数大于等于三，说明只存在｛0，0，0｝这种情况。
		if(zero_pos == 0 && zero_num>=3) {output.push_back({0,0,0});return output;}
		
		//如果 right_pos为初始值 -1，0不在第一位，且 0的个数大于等于三，说明只存在｛0，0，0｝这种情况,否则，为空。
		if(right_pos == -1 && zero_pos>0) 
		{
			if(zero_num>=3) {output.push_back({0,0,0});return output;}
			else return output;
		}
		
		int elem_0 = 0,elem_1 =0,elem_2=0;  //定义三个元素
        
		int left_val = (zero_pos==-1) ? right_pos:zero_pos; //判断是否存在0，存在，元素0，停止循环位为zero_pos，否则是 right_pos
        
        int endpos = len-1;
		for(int i = 0;i<left_val;i++)
		{
			elem_0 = nums[i];
			if(i>0&&elem_0 == nums[i-1]) continue; //去重			
            
            int elem_2_pos = endpos; //记录第三个的缓冲位置
            int elem_1_pos = i+1;
            
            while(elem_1_pos< elem_2_pos)
            {                          
				elem_1 = nums[elem_1_pos];
				if(elem_1_pos>(i+1) && nums[elem_1_pos] == nums[elem_1_pos-1]){elem_1_pos++; continue;} 
                elem_2 = nums[elem_2_pos];  
                if( elem_0 + elem_1 > 0) break;
                if( elem_0 + elem_1 == -elem_2)  
                {                     
                    output.push_back({elem_0,elem_1,elem_2});
                    elem_1_pos++;elem_2_pos--; 
                }else if(elem_0+elem_1 > -elem_2) { elem_2_pos--; }
                 else if(elem_0+elem_1 < -elem_2) { elem_1_pos++;}     
            } 
        }
                                                      	
		if(zero_pos >0 && zero_num>=3) output.push_back({0,0,0});
		
		return output;
    }
};

