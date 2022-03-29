var XXX = function(nums1, nums2) {
    let m = nums1.length;
    let n = nums2.length;
    if (m>n){
        [m,n]=[n,m];
        [nums1,nums2]=[nums2,nums1]
    }
    let mini=0;
    let maxi=m;
    let half=(m+n+1)/2
    while(mini<=maxi){
        let i =parseInt((mini+maxi)/2);
        let j =parseInt(half-i);
        if(nums1[i-1]>nums2[j] && i>mini){
           maxi=i-1;
        }else if(nums1[i]<nums2[j-1] && i < maxi)
        {
           mini=i+1;     
        }
        else
        {   
            let maxleft=0;
            if(i==0){maxleft= nums2[j-1];}
            else if (j==0){maxleft=nums1[i-1]}
            else{
                maxleft=Math.max(nums1[i-1],nums2[j-1]);
            }
            if((m+n)%2==1){
                return maxleft;
            }
            let minright=0;
            if(i==m){minright=nums2[j]}
            else if(j==n){minright=nums1[i]}
            else{minright=Math.min(nums1[i],nums2[j]);}
            
            return (maxleft+minright)/2.0;
            
        }
    }
    return 0.0;
};