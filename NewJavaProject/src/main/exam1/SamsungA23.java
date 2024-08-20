package main.exam1;

public class SamsungA23 implements SamsungASeries {

	@Override
	public String getModel() {
		return "Samsung A23 5G";
	}

	@Override
	public Long getPrice() {
		// TODO Auto-generated method stub
		return 23000L;
	}

	@Override
	public Integer getCameraMP() {
		// TODO Auto-generated method stub
		return 64;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getModel() + " MP :" + this.getCameraMP();
	}
	
	

}
