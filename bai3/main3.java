package bai3;

import java.util.Scanner;

public class main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TuyenSinh ts = new TuyenSinh();
		
		int n = 0;
		
		do
		{
			System.out.println("Các chức năng: "
					           + "\n1. Thêm mới thí sinh" 
					           + "\n2. Hiển thị thông tin và khối thi của thí sinh"
					           + "\n3. Tìm kiếm theo số báo danh"
					           + "\n0. Thoát khỏi chương trình");
			System.out.println("Chọn chức năng: ");
			n = sc.nextInt();
			sc.nextLine();
			
			if(n == 1)
			{
				ts.themSinhVien();
				System.out.println("----------");
			}
			else if (n == 2)
			{
				ts.xuatThongTinTS();
				System.out.println("----------");
			}
			else if(n == 3)
			{
				ts.timTheoSBD();
				System.out.println("----------");
			}
			else {}
			
		} while(n != 0);
		
	}

}
