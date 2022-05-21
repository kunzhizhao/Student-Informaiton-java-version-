package 學生資訊管理系統;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Studentinfomation {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("學生資訊管理系統， 1) 新增學生   2) 刪除學生   3) 更新學生資料   4) 顯示所有學生");
		System.out.println("請輸入選項操作    (按-1離開)");
		int option = 0;
		Student[] stud = new Student[20];
		Student op = new Student(option, null, option, null, option);
		
		int id=1;//用於自動填寫學號
		
		while(option != -1) {
			int outoption =0;
			option = scan.nextInt();
		
		switch(option) {
		case 1://新增學生(id,name,sex,birthday,enabled)
			
			while(outoption != 9){
			
			System.out.println("新增學生");
			
			System.out.println("請輸入姓名；");
			String name = scan.next();
			
			System.out.println("請輸入性別：1：男性、2：女性");
			int sex = scan.nextInt();
			
			System.out.println("請輸入生日：ex:????/??/??");
			String birthday = scan.next();
			
			System.out.println("請輸入是否在學：0:不在學、1:在學");
			int enabled = scan.nextInt();
			
			stud[id] = new Student(id,name,sex,birthday,enabled);
			id++;//每巡迴一次id就+1
			
			System.out.println("新增成功，繼續輸入請按1，其他選項請按9");
			outoption=scan.nextInt();
			
			}
			op.option();
			break;
			
		case 2://刪除學生
			
			while(outoption != 9){
			
			System.out.println("輸入要刪除的學號");
			int del = scan.nextInt();
			stud[del]=new Student(0,"No information",0,"No information",0);
			System.out.println("刪除完成");
			
			System.out.println("繼續輸入起案1，其他選項請輸入9");
			outoption=scan.nextInt();
			}
			op.option();
			
			break;
			
		case 3://更新學生資料
			
			while(outoption != 9){
				
			System.out.println("變更學生資料");
					
			System.out.println("輸入學號");
			id = scan.nextInt();
			
			System.out.println("變更姓名：");
			stud[id].name = scan.next();
			
			System.out.println("變更性別：1：男性、2：女性");
			stud[id].sex = scan.nextInt();
			
			System.out.println("變更生日：ex:????/??/??");
			stud[id].birthday = scan.next();
			
			System.out.println("變更在學紀錄：0:不在學、1:在學");
			stud[id].enabled = scan.nextInt();
			
			System.out.println("繼續輸入起案1，其他選項請輸入9");
			outoption=scan.nextInt();
			}
			op.option();
			break;
			
		case 4://顯示所有學生
			System.out.println("顯示所有學生");
			try {
			for(int i=1;i<stud.length;i++) {
				stud[i].infomation();
			}
			System.out.println("繼續輸入起案1，其他選項請輸入9");
			outoption=scan.nextInt();
			
			}catch(NullPointerException e){
				System.out.println("學生人數不到20人，請繼續輸入");
			}
			op.option();
			break;
		}
		}
		System.out.println("程式結束");
	}
}