 int XXX(char * s){
    int num=0,ok=0,m=0;
    int a,b,c;
    for(int i=0;;i++){
        switch(s[i]){
            case '\0': goto go_out;
            case ' ':if(m) goto go_out; break;
            case '-':{
                if(m) goto go_out;
                ok=m=1;
                break;
            }
            case '+': if(m) goto go_out; m=1; break;
            default:{
                if(s[i]>='0' && s[i]<='9'){
                a=(int)s[i]-0x30;
                
                if(num){
                    if(ok){
                        if(num==1) goto go_next;
                        c=INT_MIN/(-1*num);
                        if(c>=10){
                            b=INT_MIN-((-1*num)*10);
                            if(b>=(-1*a)) goto go_less;
                        }else goto go_less;
                    }else{
                        c=INT_MAX/num;
                        if(c>=10){
                            b=INT_MAX-num*10;
                            if(b<a)
                                goto go_above;
                        }else goto go_above;
                    }

                }
                go_next:
                    num*=10;
                    num+=a;
                    m=(m)?(m):(1);
                }else goto go_out;
            }
        }
    }
    go_out: return (ok)?(-1*num):(num);
    go_above: return 0x7fffffff;
    go_less: return 0x80000000;
}

