var XXX = function(s) {
    var arr = s.split("");
    var result = 0;
    for(var i=arr.length-1; i>=0; i--){
        if(arr[i] == "I"){
            result+=1;
        }else if(arr[i] == "V"){
            if(arr[i-1] == "I"){
                result+=4;
                i--;
            }else{
                result+=5;
            }
        }else if(arr[i] == "X"){
            if(arr[i-1] == "I"){
                result+=9;
                i--;
            }else{
                result+=10;
            }
        }else if(arr[i] == "L"){
            if(arr[i-1] == "X"){
                result+=40;
                i--;
            }else{
                result+=50;
            }
        }else if(arr[i] == "C"){
            if(arr[i-1] == "X"){
                result+=90;
                i--;
            }else{
                result+=100;
            }
        }else if(arr[i] == "D"){
            if(arr[i-1] == "C"){
                result+=400;
                i--;
            }else{
                result+=500;
            }
        }else if(arr[i] == "M"){
            if(arr[i-1] == "C"){
                result+=900;
                i--;
            }else{
                result+=1000;
            }
        }
    }
    return result;
};

