 double XXX(int* nums1, int nums1Size, int* nums2, int nums2Size){
int i=0;//1  3456   12   17  5  1 34    127  59
int f[1001]={0};
int a=0,s=0;
int z=nums1Size+nums2Size;//总长
while(i<=z/2){

    if(a>=nums1Size)
      { f[i]=nums2[s++];}
    else if(s>=nums2Size){
         f[i]=nums1[a++];
    }
    else if(nums1[a]<nums2[s]){
            f[i]=nums1[a];
                a=a+1;
    }
    else {
        f[i]=nums2[s];
        s=s+1;
    }
    i=i+1;
}

i=i-1;
if(z%2==0) return (double)(f[i]+f[i-1])/2;
else  return (double)f[i];
}

