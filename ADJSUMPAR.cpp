#include <iostream>
using namespace std;

int main() {
	int t,n,b,cnt;
	cin >> t;
	while(t--)
	{
	    cin >> n;
	    cnt = 0;
	    for(int i=0;i<n;i++)
	    { 
	        cin >> b ;
	        if(b==1) cnt++;
	    }
	    if(cnt%2==0) cout <<"YES"<< endl;
	    else cout<<"NO"<<endl ;
	    
	}
	return 0;
}
