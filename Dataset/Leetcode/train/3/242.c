 int r[256] = {0};
int XXX(char * s) {
  
  int max = 0, len = 0;
  char *p = s, *z = s;
  memset(r, 0, sizeof(int)*256);
  while (*p != '\0') {
    if (r[*p] == 1) {
      //memset(r, 0, sizeof(int)*256);
      if (p - s> max) {
        max = p - s;
      }
      while(*s != *p) {
        r[*s] = 0;
        s++;
      }
      r[*s] = 0;
      s++;
      continue;
    }
    r[*p] = 1;
    p++;
  }
  if (p - s > max) {
    max = p - s;
  }

  return max;
}

