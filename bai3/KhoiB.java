package bai3;

public class KhoiB extends QuanLyThiSinh {
	final private String khoi = "Khoi B";
	
	public KhoiB() {}
	
	public KhoiB(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
		super(soBaoDanh, hoTen, diaChi, mucUuTien);
	}
	
	public void monKhoiA()
	{
		System.out.println("Mon khoi A: toan, hoa, sinh");
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
