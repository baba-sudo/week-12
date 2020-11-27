public class test {
    public static void main(String[] args) {
    	int a,i=0,j=1,k =i + j ;
    	for (a = 1;a<=18; a++){    		
    		System.out.print(k+" ");
    	    k =i + j;
    		i = j;
    		j = k;

    	}
    
    }}




import java.util.Scanner;
public class test {
    public static void main(String[] args) {
    	int i=0,j=0;
    	Scanner scanner =new Scanner(System.in);
		System.out.println("数入一个数：");
		i = scanner.nextInt();
    	j=i;
    	int sum=0;
    	for (int a=1;a<=5;a++){
    		sum+=i;
    		i=i*10;
    		i+=j;    	
    		}
    	System.out.print(sum);

    	
}
    }
    
    
    
public class test1 {
	public static void main(String[] args) {
		for (int a=1;a<=4;a++){
			for(int b=1;b<=4;b++){
				if(a!=b){
					for(int c=1;c<=4;c++){
						if(c!=b&&c!=a){
							System.out.print(a);
							System.out.print(b);
							System.out.print(c);
							System.out.print(" ");
						}
					}
				}
			}
		}
		
	}

}
