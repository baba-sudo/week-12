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
