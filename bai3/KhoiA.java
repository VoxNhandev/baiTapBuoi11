package bai3;

public class KhoiA extends QuanLyThiSinh {
	final private String khoi = "Khoi A";
	
	
	public KhoiA() {}
	
	public KhoiA(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
		super(soBaoDanh, hoTen, diaChi, mucUuTien);
	}
	
	public void monKhoiA()
	{
		System.out.println("Mon khoi A: toan, ly, hoa");
	}
	
	@Override
	public String toString() {
		return "Thông tin: " + 
				"\n Số báo danh: " + this.getSoBaoDanh() + 
				"\n Họ tên: " + this.getHoTen() +
				"\n Địa Chỉ: " + this.getDiaChi() +
				"\n Mức ưu tiên: " + this.getMucUuTien() +
				"\n Khối thi: " + this.khoi;
	}
	
	
	
	

}
