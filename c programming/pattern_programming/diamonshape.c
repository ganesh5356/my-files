#include<stdio.h>
int main(){
    int n;
    printf("enter the no rows : ");
    scanf("%d",&n);
    int sp=n-1,st=1;
    int a=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=sp;j++){
           printf("   ");
        }
        for(int j=1;j<=st;j++){
            printf("%c  ",(char)(a+64));
            a++;
         } 
         
         sp--;
         st+=2;
        printf("\n");
    }
    int sp1=1,st1=2*n-3;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=sp1;j++){
           printf("   ");
        }
        for(int j=1;j<=st1;j++){
            printf("%c  ",(char)(a+64));
            a++;
         }
         sp1++;
         st1-=2;
        printf("\n");
    }
    return 0;

}