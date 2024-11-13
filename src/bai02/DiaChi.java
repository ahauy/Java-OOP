package bai02;

public class DiaChi {
	
	// khai bao thuoc tinh :
	private String thon, xa, huyen, tinh;
	
	// ham tao khong doi so :
	public DiaChi() {}

	public DiaChi(String thon, String xa, String huyen, String tinh) {
		super();
		this.thon = thon;
		this.xa = xa;
		this.huyen = huyen;
		this.tinh = tinh;
	}

	public String getThon() {
		return thon;
	}

	public void setThon(String thon) {
		this.thon = thon;
	}

	public String getXa() {
		return xa;
	}

	public void setXa(String xa) {
		this.xa = xa;
	}

	public String getHuyen() {
		return huyen;
	}

	public void setHuyen(String huyen) {
		this.huyen = huyen;
	}

	public String getTinh() {
		return tinh;
	}

	public void setTinh(String tinh) {
		this.tinh = tinh;
	}

	@Override
	public String toString() {
		return "DiaChi [thon=" + thon + ", xa=" + xa + ", huyen=" + huyen + ", tinh=" + tinh + "]";
	}
	
	
}
