
public class Channel {

	private String name;
	private String type; // ASYN or SYN
	private int buffer; // Counter; how many messages were sent, but not received
	
	public Channel(String name, String type) {
		setName(name);
		setType(type);
		
		// ASYN mapped to zero.
		if(this.getType() == "Asynchronous") {
			this.setBuffer(0);
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getBuffer() {
		return buffer;
	}

	public void setBuffer(int buffer) {
		this.buffer = buffer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
