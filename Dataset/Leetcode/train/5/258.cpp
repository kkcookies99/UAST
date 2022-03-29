 class Solution {
public:
    string XXX(string s) {
		int len = s.size();
		if(len <= 1) return s; 

		int MaxPos_Start_1 =0,MaxPos_Start_2=0,Buf_Pos_1 = 0,Buf_Pos_2=0;		
		int len_1=0,len_2=0,len_buf_1=0,len_buf_2=0;

		for(int i = 0; i < len ;i++)
		{
            if(i == len - 1) break;
			for (int j =0;j<i+1;j++)
			{
				if(s[i-j]==s[i+j])
				{					
					Buf_Pos_1 = i-j;
					len_buf_1 = 2*j+1;
				}else break;				
			}
            for (int j =0;j<i+1;j++)
			{
                 if(s[i-j]==s[i+1+j])
				{		
					Buf_Pos_2 = i-j;
					len_buf_2 = 2*(j+1);
				}else break;
			}	
	 
			if(len_1 >= len_buf_1) len_1 = len_1;
			else {len_1 = len_buf_1;MaxPos_Start_1= Buf_Pos_1;}
		    len_buf_1 = 0;Buf_Pos_1 = 0;
			if(len_2 >= len_buf_2) len_2 = len_2;
			else {len_2 = len_buf_2;MaxPos_Start_2=Buf_Pos_2;}
			len_buf_2 = 0;Buf_Pos_2 = 0;
		}
        
		string max_str = (len_1 >= len_2)?string(s,MaxPos_Start_1,len_1):string(s,MaxPos_Start_2,len_2);
		if(max_str == "" ) max_str = s[0];		
		return max_str;			
    }
};

