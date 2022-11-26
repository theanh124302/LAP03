#include <iostream>

using namespace std;
int n,m,k,t[50][50],ck[50][50],a,b,p,arr[50],load[50],Min=1000000000,ck2,Max=0;
void check(int n)
{
    for(int i=1;i<=n;i++){
        printf("%d",arr[i]);
    }
    printf("\n");
}

void Try(int x)
{
    if(x>n) {
        Max=0;
        for(int i=1;i<=m;i++){
            if(Max<load[i]) Max=load[i];
        }
        if(Min>Max) Min=Max;
        check(n);
    }
    for(int i=1; i<=m;i++){
        if(t[i][x]==1){
            ck2=0;
            for(int j=1;j<x;j++){
                if(arr[j]==i&&ck[x][j]==1)  ck2=1;
            }
            if(ck2==0) {
                if(load[i]<Min){
                    load[i]++;
                    arr[x]=i;
                    Try(x+1);
                    load[i]--;
                }

            }
        }
    }
}

int main()
{
    cin>>m>>n;
    for(int i = 1; i <= m ; i++ ){
        cin>>k;
        t[i][0]=k;
        for(int j=1;j<=k;j++){
            cin>>p;
            t[i][p]=1;
        }
    }
    cin>>k;
    for(int i=1;i<=k;i++){
        cin>>a>>b;
        ck[a][b]=1;
        ck[b][a]=1;
    }
    Try(1);
    cout<<Min;
    return 0;
}
