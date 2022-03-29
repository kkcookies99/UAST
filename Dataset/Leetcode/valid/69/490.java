 public int XXX(int x) {
        if(x<2)return x;
        int res = 0;
        int L = 1;
        int R = x/2;
        while(L<R){
            int mid = L+((R-L+1)>>1); //L+（R-L）/2是向下取整，如果向下取整，
            //在下面第一个if分支里有可能陷入死循环，所以改为向上取整L+（R-L+1）/2；
            long nums = (long)mid*(long)mid;
            if(x>nums){         
                L = mid;  //注意mid^2如果是小于x的话，
                    //mid有可能就是要求的答案的，所以L赋值为mid,不能赋值为mid+1!!!!!!!!
            }    
            else if(x<nums){//mid^2大于x则mid必不为我要求的答案，直接舍弃，R赋值为 mid-1；
                R = mid-1;
            }
            else return mid;
        }
        return L;

    }

