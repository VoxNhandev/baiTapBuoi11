package bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh implements TS {
	private ArrayList<QuanLyThiSinh> danhSach;
	
	public TuyenSinh()
	{
		this.danhSach  = new ArrayList<QuanLyThiSinh>();			
	}
	
	public TuyenSinh(ArrayList<QuanLyThiSinh> danhSach) {
		this.danhSach = danhSach;
	}

	public void themSinhVien() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vui Lòng chọn khối thi: "
				           + "\n1. Khối A: toán, lý, hóa"
				           + "\n2. Khối B: toán, hóa, sinh"
				           + "\n3. Khối C: văn, sử, địa");
		System.out.println("Vui lòng chọn: ");
		int khoi = sc.nextInt();
		
		System.out.println("Nhập số báo danh: ");
		String sbd = sc.nextLine();
		sc.nextLine();
		System.out.println("Nhập họ và tên: ");
		String hoTen = sc.nextLine();
		System.out.println("Nhập địa chỉ: ");
		String diaChi = sc.nextLine();
		System.out.println("Nhập mức ưu tiên: ");
		int mucUT = sc.nextInt();
		sc.nextLine();
		
		if (khoi == 1)
		{	
			QuanLyThiSinh qlts1 = new KhoiA(sbd, hoTen, diaChi, mucUT);
			KhoiA kA = (KhoiA) qlts1; // tính đa hình
			add1(kA);
		}
		else if (khoi == 2)
		{
			QuanLyThiSinh qlts2 = new KhoiB(sbd, hoTen, diaChi, mucUT);
			KhoiB kB = (KhoiB) qlts2;
			add2(kB);
		}
		else if (khoi == 3)
		{
			QuanLyThiSinh qlts3 = new KhoiC(sbd, hoTen, diaChi, mucUT);
			KhoiC kC = (KhoiC) qlts3;
			add3(kC);
		}
			
	}
	
	public void add1(KhoiA KA) {
		this.danhSach.add(KA);
	}
	
	public void add2(KhoiB KB) {
		this.danhSach.add(KB);
	}
	
	public void add3(KhoiC KC) {
		this.danhSach.add(KC);
	}

	public void xuatThongTinTS() {
	
		for (int i = 0; i < danhSach.size(); i++) {
			
			System.out.println(danhSach.get(i));
			System.out.println("---------");
			
		}
		
	}

	public void timTheoSBD() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập số báo danh thí sinh cần tìm: ");
		String sbd = sc.nextLine();
		sc.nextLine();
		
		for (int i = 0; i < danhSach.size(); i++) {
			if (danhSach.get(i).getSoBaoDanh().equals(sbd))
			{
				System.out.println(danhSach.get(i));
				return;
			}
		}
		
		System.out.println("Số báo danh không có trong danh sách");
		
		
	}

}
