package aspire.test;

public class Test2 {

	public void println(){
		String sql = "select * from lxc_user";
		System.out.println(sql);
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
	
	public static void main(String[] args) {
		for (int num = 0; num < 5; num++) {
			System.out.println(num);
		}
	}


}
