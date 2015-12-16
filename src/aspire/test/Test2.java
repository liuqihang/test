package aspire.test;

public class Test2 {

	public static void main(String[] args) {
		for (int num = 0; num < 5; num++) {
			System.out.println(num);
		}
	}
	
	public void test(){
		System.out.println("Haha333");
	}
	
	public boolean selectAll(int num){
		while(true){
			if(num == 5){
				return true;
			}
			break;
		}
		return false;
	}
}
