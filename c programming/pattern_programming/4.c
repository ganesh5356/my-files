#include<stdio.h>
int main(){
    int n;
    printf("enter the no rows : ");
    scanf("%d",&n);
    int sp=n/2+1,st=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=sp;j++){
            printf("  ");
            
        }
        for(int j=1;j<=st/2+1;j++){
            printf("%d ",j);
            
        }
        int a=1;
        for(int j=st;j>=st/2+2;j--){
            printf("%d ",a);
            a++;
        }
        sp--;
        st+=2;
        printf("\n");
    }
    return 0;
}
