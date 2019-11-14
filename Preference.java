
public class Preference {
	
	private int quietTime;
	private int music;
	private int chatting;
	private int reading;
	
	public Preference(int quietTime, int music, int chatting, int reading) {
		this.quietTime = quietTime;
		this.music = music;
		this.chatting = chatting;
		this.reading = reading;
	}
	
	public int getQuietTime() {
		return quietTime;
	}
	
	public int getMusic() {
		return music;
	}
	
	public int getChatting() {
		return chatting;
	}
	
	public int getReading() {
		return reading;
	}
	
	public int compare(Preference pref) {
		int diff = 0;
		int q = pref.quietTime;
		int m = pref.music;
		int c = pref.chatting;
		int r = pref.reading;
		diff += (Math.abs(q - quietTime) + Math.abs(m - music) + Math.abs(c - chatting) + Math.abs(r - reading));
		
		return diff;
	}

}
