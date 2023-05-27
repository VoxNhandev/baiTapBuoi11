package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCanBo {
	private ArrayList<CanBo> danhSach;
	
	public QuanLyCanBo()
	{
		this.danhSach = new ArrayList<CanBo>();
	}
	
	public QuanLyCanBo(ArrayList<CanBo> danhSach) {
		this.danhSach = danhSach;
	}
	
	public ArrayList<CanBo> getDanhSach() {
		return danhSach;
	}


	public void setDanhSach(ArrayList<CanBo> danhSach) {
		this.danhSach = danhSach;
	}


	public void input()
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Chọn đơn vị bạn muốn thêm vào: "
				           + "\n1. công nhân"
				           + "\n2. kỹ sư"
				           + "\n3. nhân viên");
		System.out.print("Vui lòng chọn: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Nhập họ tên: ");
		String hoten = sc.nextLine();
		System.out.println("Nhập tuổi: ");
		int tuoi = sc.nextInt();
		sc.nextLine();
		if(tuoi <= 0)
		{
			System.out.println("ERROR");
			return;
		}
		System.out.println("Nhập Giới tính: ");
		String gioiTinh = sc.nextLine();
		System.out.println("Nhập địa chỉ: ");
		String diaChi = sc.nextLine();
		
		
		if (n == 1) {
			System.out.println("Nhập cấp bậc: ");
			int lv = sc.nextInt();
			if (lv < 1 || lv > 10)
			{
				System.out.println("ERROR");
				return;
			}
		CongNhan congNhan = new CongNhan(hoten, tuoi, gioiTinh, diaChi, lv);
		addCongNhan(congNhan);
		}
		else if(n ==2 )
		{
			System.out.println("Nhập ngành đào tạo: ");
			String f = sc.nextLine();
			KySu kySu = new KySu(hoten, tuoi, gioiTinh, diaChi, f);
			addKySu(kySu);
		}
		else if (n == 3)
		{
			System.out.println("Nhập công việc: ");
			String task = sc.nextLine();
			NhanVien nv = new NhanVien(hoten, tuoi, gioiTinh, diaChi, task);
			addNhanVien(nv);
		}
		else {};
		
	}
	
//	
	public void addCongNhan(CongNhan cb1)
	{
		this.danhSach.add(cb1);	
	}
	
	public void addKySu(KySu cb2)
	{
		this.danhSach.add(cb2);
	}
	
	public void addNhanVien (NhanVien cb3)
	{
		this.danhSach.add(cb3);
	}
//	
	
	public void timTheoHoTen()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Tìm kiếm cán bộ theo họ và tên: ");
		String n = sc.nextLine();
		
		for (int i = 0; i < danhSach.size(); i++) 
		{
			
			if (danhSach.get(i).getFullName().equals(n))
			{
				System.out.println(danhSach.get(i).toString());
			}
			
		}
		
	}
	
	public void xuatDsCacCanBo()
	{
		for (int i = 0; i < danhSach.size(); i++) 
		{
			System.out.println(danhSach.get(i).toString());
		}
		
	}
	
	

}
