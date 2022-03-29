 var XXX = function(nums1, m, nums2, n) {
    var result=[];
    var cur1=0;
    var cur2=0;
    while(cur1<m && cur2<n){
        if(nums1[cur1]<=nums2[cur2]){
            result.push(nums1[cur1]);
            cur1++;
        }
        else{
            result.push(nums2[cur2]);
            cur2++;
        }
    }
    if(cur1==m){
        for(cur2;cur2<n;cur2++){
            result.push(nums2[cur2]);
        }
    }
    else if(cur2==n){
        for(cur1;cur1<m;cur1++){
            result.push(nums1[cur1]);
        }
    } 
    return result;   
};

