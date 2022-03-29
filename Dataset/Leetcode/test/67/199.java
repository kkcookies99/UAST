 class Solution {
    public String XXX(String a, String b) {
              Stack<Integer> stack=new Stack();
              char[] ca=a.toCharArray();
              char[] cb=b.toCharArray();
              boolean flag=false;

              int index1=ca.length-1;
              int index2=cb.length-1;

              while (index1>=0 && index2>=0){
                  if (ca[index1] == '1' && cb[index2] == '1') {
                      if(flag){
                          stack.push(1);

                      }else{
                          stack.push(0);
                          stack.push(1);
                          flag=true;
                      }
                  } else if (ca[index1] == '0' && cb[index2] == '0') {
                      if(flag){
                          flag=false;
                      }else{
                          stack.push(0);
                      }

                  }else{
                      if(flag){
                          stack.pop();
                          stack.push(0);
                          stack.push(1);
                      }else{
                          stack.push(1);
                      }
                  }

                  index1--;
                  index2--;
                  }

             while(index1 >=0){
                  if(ca[index1] == '1' && flag){
                      stack.pop();
                      stack.push(0);
                      stack.push(1);
                      index1--;
                  }else{
                        if(ca[index1] == '0' && flag){
                            stack.pop();
                            stack.push(1);
                            index1--;
                            flag=false;
                        }else{
                            stack.push(ca[index1] == '1' ? 1 : 0);
                            index1--;
                        }

                  }

              }

              while(index2 >=0){
                  if(cb[index2] == '1' && flag){
                      stack.pop();
                      stack.push(0);
                      stack.push(1);
                      index2--;
                  }else{
                      if(cb[index2] == '0' && flag){
                          stack.pop();
                          stack.push(1);
                          index2--;
                          flag=false;
                      }else {
                          stack.push(cb[index2] == '1' ? 1 : 0);
                          index2--;
                      }
                  }

              }

              StringBuilder stringBuilder=new StringBuilder();
              while (stack.size() >0){
                  stringBuilder.append(stack.pop());
              }
                  return stringBuilder.toString();
    }
}

