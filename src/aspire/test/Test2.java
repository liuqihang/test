package aspire.test;

public class Test2 {

	public void println(){
		String sql = "select * from lxc_school";
		System.out.println(sql);
	}

	public static boolean selectAll(int num){
		while(true){
			if(num == 5){
				return true;
			}
			break;
		}
		return false;
	}

	public static void main(String[] args) {
		boolean flag = selectAll(5);
		System.out.println(flag);
	}


}
