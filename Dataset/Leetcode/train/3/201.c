 struct ht{
    int key;
    int val;
    UT_hash_handle hh;
};
struct ht* hp=NULL;
struct ht* find(int ikey){
    struct ht* tmp;
    HASH_FIND_INT(hp,&ikey,tmp);
    return tmp;
}
void insert(int ikey,int ival){
    struct ht* it=find(ikey);
    if(it==NULL){
        struct ht* tmp=malloc(sizeof(struct ht));
        tmp->key=ikey,tmp->val=ival;
        HASH_ADD_INT(hp,key,tmp);
    }else{
        it->val=ival;
    }
}
int XXX(char * s){
    int i,count=0,start=0,max=0;
    struct ht* it=NULL;
    for(i=0;s[i]!='\0';i++){
        it=find((int)s[i]);
        if(it!=NULL){
            if(it->val>start){
                count=i-start;
                if(count>max){
                    max=count;
                }
                start=it->val;
            }
        }
        insert((int)s[i],i+1);
    }
    count=i-start;
    return count>max?count:max;
}