#include<stdio.h>
int main(){
    int n;
    printf("enter the no rows : ");
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        int a=1;
        for(int j=1;j<=i;j++){
            if(i%2==0)
            printf("%c ",(char)(j+64));
            else
            printf("%d ", j);
            a+=2;
        }
        printf("\n");
    }
    return 0;
}