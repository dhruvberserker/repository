      #include<stdio.h>
      #include<math.h>

void main(){
int a,b,c,s,e;

    printf("please enter 3 numbers...");

    scanf("%d%d%d",&a,&b,&c);
    s=(a+b+c)/2;
    e=sqrt(s*(s-a)*(s-b)*(s-c));
    printf("the area e is equal to=%d",e);

           }
