package �ǥ͸�T�޲z�t��;
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
		System.out.println("�Ǹ��F"+id+" , �m�W�G"+name+" , �ʧO�G"+sex+" , �ͤ�G"+birthday+" , �O�_�b�ǡG"+enabled);
	}
	void option() {
		System.out.println("1) �s�W�ǥ�   2) �R���ǥ�   3) ��s�ǥ͸��   4) ��ܩҦ��ǥ�");
	}
}
/*
1. id �ǥͧǸ��A���
2. name �ǥͩm�W�A�r��
3. sex �ǥͩʧO�A��ơA0-male 1-female
4. birthday �ǥͥͤ�A�r��
5. is_enabled �O�_�b�ǡA��ơA0-disabled 1-enabled  �w�]��1
*/