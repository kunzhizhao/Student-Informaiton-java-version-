package 學生資訊管理系統;
public class Digitaljudgment {
	
	int inputnumber;
	Digitaljudgment(int inputnumber){
		this.inputnumber = inputnumber;
	
	}
	void judgment() {
		if(inputnumber>3||inputnumber<1) {
			System.out.println("超出範圍");
		}else if(inputnumber!=0) {
			
		}
	}
}
