 var XXX = function(strs) {
    if(strs.length<1){return '';}
    else if(strs.length==1){return strs[0]};
    var result = '';
    var i,j,flag,s;
    j=0;
    while(1){
        flag = 0;
        s = strs[0][j];
        for(i=1;i<strs.length;i++){
           if(s!=strs[i][j]){
                flag = 1;
           }
        }
        if(flag||s==null){return result;}
         else result+=s;
        j++;
    }
   
};

