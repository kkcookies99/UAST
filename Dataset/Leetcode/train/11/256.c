int XXX(int* height, int heightSize){
    int *p = height;
    int *q = height+heightSize-1;
    int maxS =(heightSize-1)*(*p>*q?*q:*p);
    int *min;

    while(p != q){
        min = *p>*q?q:p;
        if(min == p){
            maxS=(*(min+1)>*q?*q:*(min+1))*(heightSize-2)>maxS?(*(min+1)>*q?*q:*(min+1))*(heightSize-2):maxS;
            p++;
        }else{
            maxS=(*(min-1)>*p?*p:*(min-1))*(heightSize-2)>maxS?(*(min-1)>*p?*p:*(min-1))*(heightSize-2):maxS;
            q--;
        }
       heightSize--;
    }
    return maxS;
}

