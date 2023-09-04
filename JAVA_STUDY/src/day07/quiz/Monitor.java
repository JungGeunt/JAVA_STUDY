package day07.quiz;

public class Monitor {

	//멤버변수 (속성)
	public String resolution;
	public int size;
	public int brightness;
	public boolean on_off;
	
	
	//constructor 생성자 
	public Monitor(String resolution, int size, int brightness, boolean on_off) {
		
		this.resolution = resolution;
		this.size = size;
		this.brightness = brightness;
		this.on_off = on_off;
		
	}
	
	// 전원 매서드 
	
	public void pressPowerButton() {
		on_off =!on_off;
	}
	
	
    //게터 세터 
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getBrightness() {
		return brightness;
	}
	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}
	public boolean isOn_off() {
		return on_off;
	}
	public void setOn_off(boolean on_off) {
		this.on_off = on_off;
	}
	
	
	
}
