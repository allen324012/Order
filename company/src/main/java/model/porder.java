package model;

public class porder {
	private Integer id;
	private String name;
	private Integer lcd=0;
	private Integer ram=0;
	private Integer sum;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getLcd() {
		return lcd;
	}
	public void setLcd(Integer lcd) {
		this.lcd = lcd;
		calSum();
	}
	public Integer getRam() {
		return ram;
	}
	public void setRam(Integer ram) {
		this.ram = ram;
		calSum();
	}
	public Integer getSum() {
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	
	void calSum()
	{
		this.sum=this.lcd*100+this.ram*1000;
	}
	
	
	

}
