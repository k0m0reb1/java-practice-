//题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），
//凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
public class Practice37{
  public static void main(String[] args) {
    int n=10;
    int[] arr=new int[n];
    int j=1;
	    int sum=0;
	    while(sum<=3*n-2) {
	    	for(int i=0;i<n;i++) {
	    	sum =0;
	    		if(arr[i] !=3) {
	    			arr[i]=j++;
	    		}
	    			if(j==4) {
	    				j=1;
	    				System.out.printf("a[%d]=3 ",i);
	    			}
	    	}
	    	for(int i=0;i<n;i++) {
	    		sum+=arr[i];
	    	}
	    }
	    for(int i=0;i<n;i++) {
	    	if(arr[i] !=3) {
	    		int lastPerson = i+1;
	    		System.out.printf("最后剩下来的是第%d个人",lastPerson);
	    	}
	    }
  }
}
