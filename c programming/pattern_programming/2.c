#include<stdio.h>
int main(){
    int n;
    printf("enter the no rows : ");
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            int a=n/2+1;
            if(i==1 || j==1 || i==n || j==n)
            printf("* ");
            else
            printf("  ");
        }
        printf("\n");
    }
    return 0;
}