 #define max(a,b) ((a)>(b))?(a):(b)
#define min(a,b) ((a)<(b))?(a):(b)
#define INF 65535

double seq_find(int odd,int *small, int s_size, int* large, int l_size)
{
    int mid_pos = (s_size+l_size+1)/2;
    if(mid_pos == s_size)
        return odd?small[s_size-1]:(small[s_size-1]+large[0])/2.0f;
    else if(mid_pos < s_size)
        return odd?small[mid_pos-1]:(small[mid_pos-1]+small[mid_pos])/2.0f;
    else
        return odd?large[mid_pos-s_size-1]:(large[mid_pos-s_size-1]+large[mid_pos-s_size])/2.0f;
}

double find(bool odd,int *l_array,int l_size,int *s_array,int s_size)
{
    int p_min = 1,p_max = s_size,s_max = INF;
    int i = (p_min+p_max)/2,j = (l_size+s_size+1)/2-i;
    while(p_min<=p_max)
    {
        s_max = i>=s_size?INF:s_array[i];
        if(l_array[j-1]<=s_max && s_array[i-1]<=l_array[j])
            return odd?max(s_array[i-1],l_array[j-1]):((max(l_array[j-1],s_array[i-1]))+(min(l_array[j],s_max)))/2.0f;
        else if(s_array[i-1]>l_array[j])
        {
            p_max = i-1;
            if(!p_max)
            {
                if(odd)
                    return l_array[(l_size+s_size+1)/2-1];
                else 
                    return s_array[0]>=l_array[(l_size+s_size+1)/2]?(l_array[(l_size+s_size+1)/2-1]+l_array[(l_size+s_size+1)/2])/2.0f:(s_array[0]+l_array[(l_size+s_size+1)/2-1])/2.0f;
            }
        }
        else if(s_array[i-1]<l_array[j] && l_array[j-1]>s_max)
            p_min = i+1;
        i = (p_min+p_max)/2;
        j = (l_size+s_size+1)/2-i;
    }
    return -1;
}

double XXX(int* nums1, int nums1Size, int* nums2, int nums2Size){
    bool odd = (nums1Size+nums2Size)%2;
    if(!nums1Size)
        return odd?nums2[(nums2Size-1)/2]:(nums2[(nums2Size/2)-1]+nums2[nums2Size/2])/2.0f;
    if(!nums2Size)
        return odd?nums1[(nums1Size-1)/2]:(nums1[(nums1Size/2)-1]+nums1[nums1Size/2])/2.0f;
    if(nums1Size == 1 && nums2Size == 1)
        return (nums1[0]+nums2[0])/2.0f;
    if(nums1[nums1Size-1] <= nums2[0])
        return seq_find(odd,nums1,nums1Size,nums2,nums2Size);
    if(nums2[nums2Size-1] <= nums1[0])
        return seq_find(odd,nums2,nums2Size,nums1,nums1Size);
    if(nums1Size >= nums2Size)
        return find(odd,nums1,nums1Size,nums2,nums2Size);
    else 
        return find(odd,nums2,nums2Size,nums1,nums1Size);
}

