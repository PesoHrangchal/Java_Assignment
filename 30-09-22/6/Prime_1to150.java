
public class Prime_1to150 {
	public static void  main(String args[]) {
		System.out.print(2+" ");
		for(int i=3;i<150;i++) {
			int count=1;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0)
					count=0;
				}
			if(count==1)
				System.out.print(i+" ");
			}
			}
	}
