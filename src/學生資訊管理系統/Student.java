package 學生資訊管理系統;
public class Student {
	int id;
	String name;
	int sex;
	String birthday;
	int enabled;
	
	Student(int id,String name,int sex,String birthday,int enabled){
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
		this.enabled = enabled;	
	}
	void infomation(){
		System.out.println("學號；"+id+" , 姓名："+name+" , 性別："+sex+" , 生日："+birthday+" , 是否在學："+enabled);
	}
	void option() {
		System.out.println("1) 新增學生   2) 刪除學生   3) 更新學生資料   4) 顯示所有學生");
	}
}
/*
1. id 學生序號，整數
2. name 學生姓名，字串
3. sex 學生性別，整數，0-male 1-female
4. birthday 學生生日，字串
5. is_enabled 是否在學，整數，0-disabled 1-enabled  預設為1
*/