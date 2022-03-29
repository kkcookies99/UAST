 double XXX(int* nums1, int nums1Size, int* nums2, int nums2Size){
    int p1h=0;//标记当前第一个数组中所剩首个元素的下标
    int p2h=0;//标记当前第二个数组中所剩首个元素的下标
    int p1t=nums1Size-1;//标记当前第一个数组中所剩最后元素的下标
    int p2t=nums2Size-1;//标记当前第二个数组中所剩最后元素的下标
    int step;//需要首尾各删除一个元素多少次。
    int s1=nums1Size;//数组一中当前所剩元素个数
    int s2=nums2Size;//数组二中当前所剩元素个数
    if((nums1Size+nums2Size)%2 == 1)
        step = (nums1Size+nums2Size-1)/2;
    else
        step = (nums1Size+nums2Size)/2-1;
    for(int c=0;c<step;c++){
        if(s1 == 0){//s1删空
            p2h++;
            p2t--;
            s2-=2;
        }
        else if(s2 == 0){//s2删空
            p1h++;
            p1t--;
            s1-=2;
        }else{
            if(*(nums1+p1h)<=*(nums2+p2h)){
                p1h++;
                s1--;
            }else{
                p2h++;
                s2--;
            }
            if(s1 == 0){//s1删空
                p2t--;
                s2--;
            }else if(s2 == 0){//s2删空
                p1t--;
                s1--;
            }else{
                if(*(nums1+p1t)>=*(nums2+p2t)){
                    p1t--;
                    s1--;
                }else{
                    p2t--;
                    s2--;
                }
            }
        }
    }
    if(s1 == 0){
        if(s2 == 1){
            return *(nums2+p2h);
        }else if(s2 == 2){
            return (*(nums2+p2h)+*(nums2+p2t))/2.0;
        }
    }else if(s2 == 0){
        if(s1 == 1){
            return *(nums1+p1h);
        }else if(s1 == 2){
            return (*(nums1+p1h)+*(nums1+p1t))/2.0;
        }
    }else if(s1 ==1 && s2==1){
        return (*(nums1+p1h)+*(nums2+p2h))/2.0;
    }else if(s1 == 2){
        return (*(nums1+p1h)+*(nums1+p1t))/2.0;
    }else if(s2 == 2){
        return (*(nums2+p2h)+*(nums2+p2t))/2.0;
    }
        return 0;//can't reach
}

