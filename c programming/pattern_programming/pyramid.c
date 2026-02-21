#include<stdio.h>
int main(){
    int n;
    printf("enter the no rows : ");
    scanf("%d",&n);
    int a=1,b=n-1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
           printf("* ");
        }
        for(int j=1;j<=i;j++){
            printf("* ");
         }
         
        printf("\n");
    }
    
    return 0;
}