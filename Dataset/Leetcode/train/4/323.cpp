 double XXX(vector<int>& nums1, vector<int>& nums2) {
        int M=nums1.size(),N=nums2.size(),sum=M+N;
        int mid=sum/2;
        double left=-1,right=-1;
        bool flag=false;
        if(sum%2==0)
            flag=true;
        int idx=-1,i=0,j=0;
        while(i<M || j<N)
        {   
            int temp;
            if(i<M && j<N)
            {
                if(nums1[i]<=nums2[j])
                {
                    temp=nums1[i];
                    i++,idx++;
                }
                else
                {
                    temp=nums2[j];
                    j++,idx++;
                }
            }
            else if(i<M && j>=N)
            {
                temp=nums1[i];
                i++,idx++;
            }
            else if(j<N && i>=M)
            {
                temp=nums2[j];
                j++,idx++;
            }

            if(flag==false && idx==mid)
                left=temp;
            else if(flag==true && idx==(mid-1))
                left=temp;
            else if(flag==true && idx==mid)
                right=temp;
        }
        return flag==false?left:(left+right)/2.0;
    }

