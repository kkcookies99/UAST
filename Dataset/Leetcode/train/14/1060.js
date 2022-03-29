 var XXX = function(strs) {
    var s = [];
    var string = "";
    var flag = 0;
    if(strs.length == 1)
    return strs[0];
    for(i=1;i<strs.length;i++){
        var min = Math.min(strs[i].length,strs[i-1].length)
    }
    for(var i=0;i<min;i++){
        s = strs[0].substring(0,i+1);
        for(var j=1;j<strs.length;j++){
            if(strs[j].substring(0,i+1) == s)
            continue;

            else {
                flag = 1;
                break;
            }
            flag = 0;
        }

        if(flag==1)
        {
            break;
        }
        else if(flag == 0)
            string = s;
        
      
    }
     if(string.length == 0)
     return "";
     else
     return string;

};

