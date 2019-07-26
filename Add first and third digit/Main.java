#include<stdio.h>
#include<math.h>
int main()
{
  int num,first,third,add;
  scanf("%d",&num);
  first=num/100;
  third=num%10;
  add=first+third;
  printf("%d",add);
return 0;
}