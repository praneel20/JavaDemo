package ExceptionHadling;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyException extends Exception {

public MyException(String msg) {
	// TODO Auto-generated constructor stub
	super(msg);
}
}

public class ExceptionDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int i=100,j,k;
		/************* 1. TRY WITH System.exit(0)*************/
		/*try {
			System.out.println("start try");
			System.exit(0);
			System.out.println("stop try");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("finalyy");
		}*/
		
		/*********** 2. TRY,CATCH,FINALLY WITH / BY 0 EXCEPTION********************/
		
		System.out.println("2.Enter value for j ==>");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			try {
				j=Integer.parseInt(br.readLine());
				k=i/j;
				System.out.println("value of k= "+k);
				if (k<10)
				{
					throw new MyException("Output cant be less than 10");
				}
			}
			catch (ArithmeticException e) {
				System.out.println("Number cant be divide by zero "+e);
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				System.out.println("finalyy");
			}
		
		/******** 3. TRY WITHOUT CATCH AND WITH THROWS WITH RESOURCES(BUFFERED READER) ADD THROWS STMT TO CLASS**********/
			/*try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
				System.out.println("Enter value for j--");
				j=Integer.parseInt(br.readLine());
				k=i/j;
				System.out.println("Output is=="+k);
			}
			*/
		}
	}
