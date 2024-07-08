package com.javaex.ex13;

public class TV {

	// 필드
	private int channel;
	private int volume;
	private boolean power;

	// 생성자
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	// 메소드 일반
	public void power(boolean on) {
		if (on == true) {
			this.power = true;
		} else {
			this.power = false;
		}
	}

	public void channel(int channel) {
		if (this.power == true) {
			if (channel < 1) {
				this.channel = 1;
				System.out.println("최소 채널은 1입니다.");
			} else if (channel > 255) {
				this.channel = 255;
				System.out.println("최대 채널은 255입니다.");
			} else {
				this.channel = channel;
			}
		}
	}

	public void channel(boolean up) {
		if (this.power == true) {
			if (up == true) {
				if (this.channel < 255) {
					this.channel++;
				}
			} else {
				if (this.channel > 1) {
					this.channel--;
				}
			}
		}
	}

	public void volume(int volume) {
		if (this.power == true) {
			if (volume < 0) {
				this.volume = 0;
				System.out.println("최소 볼륨은 0입니다.");
			} else if (volume > 100) {
				this.volume = 100;
				System.out.println("최대 볼륨은 100입니다.");
			} else {
				this.volume = volume;
			}
		}
	}

	public void volume(boolean up) {
		if (this.power == true) {
			if (up == true) {
				if (this.volume < 100) {
					this.volume++;
				}
			} else {
				if (this.volume > 0) {
					this.volume--;
				}
			}
		}
	}

	// 메소드 gs
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}

	public void status() {
		if (this.power == false) {
			System.out.println("TV 전원 off");
		} else {
			System.out.println("");
			System.out.println("TV 전원 on");
			System.out.println("채널 번호: " + this.channel);
			System.out.println("볼륨: " + this.volume);
		}
	}
}
