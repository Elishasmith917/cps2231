package cps2231_Tuesdaylecture_2_27_2034;

public class TV {

	// data fields
	
	private int channel;
	private int volumeLevel;
	private boolean on;
	public static int numberofTV;
	
	// constructors. the methods we will use to construct the rest of the methos
	
	public TV (){
		numberofTV += 1;
		
	}
	
	public TV (int channel, int volumeLevel, boolean on) {
		// this. local variable. this keyword separates them.
		this.channel = channel;
		this.volumeLevel= volumeLevel;
		this.on = on;
		numberofTV+=1;
		// still need to add whats in the first constructor
	}
	
	// methods 
	
	public void turnOn () {
		on = true;
	}
	
	public void turnOff () {
		on = false;
	}
	// gonna start using the getters and setters. can use eclipse to generate ( should learn hoe to do it without. go to source, click generate getters and setters, generate for channel and volumeLevel 

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		this.volumeLevel = volumeLevel;
	}

	@Override
	public String toString() {
		return "TV [channel=" + channel + ", volumeLevel=" + volumeLevel + ", on=" + on + "]";
	}
	
	// time to generate the to.string, go to sourse, generate tostring for fields. part two is moving on to the tv.test
	
	
}
