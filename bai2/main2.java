package bai2;

import java.util.Scanner;

public class main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QuanLyCanBo qlcb = new QuanLyCanBo();
		
		
		int n = 0;
		do {
			System.out.println("Vui long chon chuc nang: "
					          + "\n1. them can bo"
					          + "\n2. tim kiem theo ho va ten "
					          + "\n3. xuat danh sach cac can bo"
					          + "\n0. de thoat");
			System.out.print("Chon chuc nang: ");
			n = sc.nextInt();
			sc.nextLine();
			
			if(n == 1)
			{
				qlcb.input();
			}
			else if (n == 2)
			{
				qlcb.timTheoHoTen();
			} 
			else if (n == 3)
			{
				qlcb.xuatDsCacCanBo();
			}
			else {};
			
			
		} while (n != 0);
	}

}
