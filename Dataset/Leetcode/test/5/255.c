 int front,rear;
char *p;
int len=strlen(s);
int size=0;

p=(char*)malloc(1001*sizeof(char));

if(len==0||len==1) return s;

rear=0;
front=len-1;

while(rear<=len-1){

    front=len-1;

    if( front-rear+1 <= size ) break;

    while(rear<=front){

        if( front-rear+1 <= size ) break;

        if(s[rear] == s[front]){

            if( check(front,rear,size,s) ) {

                strcpy(p,&s[rear]);

                p[front-rear+1]='\0';

                front--;

                size=front-rear+1;
                break;
            }

        }
        front--;

    }

    rear++;
}

return p;

