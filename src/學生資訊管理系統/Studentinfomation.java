package �ǥ͸�T�޲z�t��;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Studentinfomation {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�ǥ͸�T�޲z�t�ΡA 1) �s�W�ǥ�   2) �R���ǥ�   3) ��s�ǥ͸��   4) ��ܩҦ��ǥ�");
		System.out.println("�п�J�ﶵ�ާ@    (��-1���})");
		int option = 0;
		Student[] stud = new Student[20];
		Student op = new Student(option, null, option, null, option);
		
		int id=1;//�Ω�۰ʶ�g�Ǹ�
		
		while(option != -1) {
			int outoption =0;
			option = scan.nextInt();
		
		switch(option) {
		case 1://�s�W�ǥ�(id,name,sex,birthday,enabled)
			
			while(outoption != 9){
			
			System.out.println("�s�W�ǥ�");
			
			System.out.println("�п�J�m�W�F");
			String name = scan.next();
			
			System.out.println("�п�J�ʧO�G1�G�k�ʡB2�G�k��");
			int sex = scan.nextInt();
			
			System.out.println("�п�J�ͤ�Gex:????/??/??");
			String birthday = scan.next();
			
			System.out.println("�п�J�O�_�b�ǡG0:���b�ǡB1:�b��");
			int enabled = scan.nextInt();
			
			stud[id] = new Student(id,name,sex,birthday,enabled);
			id++;//�C���j�@��id�N+1
			
			System.out.println("�s�W���\�A�~���J�Ы�1�A��L�ﶵ�Ы�9");
			outoption=scan.nextInt();
			
			}
			op.option();
			break;
			
		case 2://�R���ǥ�
			
			while(outoption != 9){
			
			System.out.println("��J�n�R�����Ǹ�");
			int del = scan.nextInt();
			stud[del]=new Student(0,"No information",0,"No information",0);
			System.out.println("�R������");
			
			System.out.println("�~���J�_��1�A��L�ﶵ�п�J9");
			outoption=scan.nextInt();
			}
			op.option();
			
			break;
			
		case 3://��s�ǥ͸��
			
			while(outoption != 9){
				
			System.out.println("�ܧ�ǥ͸��");
					
			System.out.println("��J�Ǹ�");
			id = scan.nextInt();
			
			System.out.println("�ܧ�m�W�G");
			stud[id].name = scan.next();
			
			System.out.println("�ܧ�ʧO�G1�G�k�ʡB2�G�k��");
			stud[id].sex = scan.nextInt();
			
			System.out.println("�ܧ�ͤ�Gex:????/??/??");
			stud[id].birthday = scan.next();
			
			System.out.println("�ܧ�b�Ǭ����G0:���b�ǡB1:�b��");
			stud[id].enabled = scan.nextInt();
			
			System.out.println("�~���J�_��1�A��L�ﶵ�п�J9");
			outoption=scan.nextInt();
			}
			op.option();
			break;
			
		case 4://��ܩҦ��ǥ�
			System.out.println("��ܩҦ��ǥ�");
			try {
			for(int i=1;i<stud.length;i++) {
				stud[i].infomation();
			}
			System.out.println("�~���J�_��1�A��L�ﶵ�п�J9");
			outoption=scan.nextInt();
			
			}catch(NullPointerException e){
				System.out.println("�ǥͤH�Ƥ���20�H�A���~���J");
			}
			op.option();
			break;
		}
		}
		System.out.println("�{������");
	}
}