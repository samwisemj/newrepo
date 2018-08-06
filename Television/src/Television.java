//state of the television with basic getters and setters
public class Television {
	private boolean state;
	private int volume;
	private int channel;
	
	public Television() {
		this.state = false;
		this.volume = 0;
		this.channel = 0;
	}
	public boolean getState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolumeIncrease() {
		this.volume++;
	}
	public void setVolumeDecrease() {
		this.volume--;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
}
