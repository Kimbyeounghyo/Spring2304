package kr.co.softsoldesk.beans;

public class SamsungTV implements TV{

	public SamsungTV() {
		System.out.println("===> SamsungTV 객체 생성");
	}
	
	@Override
	public void powerOn() {
		System.out.println("===> SamsungTV 전원켜기");
	}

	@Override
	public void powerOff() {
		System.out.println("===> SamsungTV 전원끄기");
	}

	@Override
	public void volumeUp() {
		System.out.println("===> SamsungTV 볼륨 업");
	}

	@Override
	public void volumeDown() {
		System.out.println("===> SamsungTV 볼륨 다운");
	}

}
