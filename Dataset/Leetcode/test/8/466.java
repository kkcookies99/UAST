 public int XXX(String s) {
        char[] str=s.toCharArray();
        StringBuilder temp = new StringBuilder();
        for(int i=0;i<s.length();i++){
            int n=0;
            if(str[i]=='-'&&temp.length()==0){
                temp.append('-');
            }
            if(str[i]>='0'&&str[i]<='9'){
                n=temp.length();
                temp.append(str[i]);
            }
            if((str[i]>='a'&&str[i]<='z')||(str[i]>='A'&&str[i]<='Z')){
                break;
            }

        }
        int n = temp.length();
        if(n==0){
            return 0;
        }
        else{

            int i;

            if(temp.charAt(0)=='-'){
                long reason = 0;
                int j=0;
                for(i=n-1;i>0;i--){
                    int k=Integer.parseInt(String.valueOf(temp.charAt(i)));
                    long sum=(long) Math.pow(10,j);
                    reason=reason+sum*k;
                    j++;
                }
                reason=-reason;
                if(reason<-2147483648||reason>2147483647){
                    return -2147483648;
                }
                else{
                    return (int)reason;
                }
            }

            else{
                long reason = 0;
                int j=0;
                for(i=n-1;i>=0;i--){


                        int k=Integer.parseInt(String.valueOf(temp.charAt(i)));
                        long sum=(long) Math.pow(10,j);
                        reason=reason+sum*k;
                        j++;



                }
                if(reason>2147483647) {

                    return -2147483648;

                }
                else{
                    return (int)reason;
                }
            }

        }


    }

