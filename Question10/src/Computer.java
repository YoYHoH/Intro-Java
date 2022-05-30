
public enum Computer {
		DELL("Intel i3","Windows 10","4G"),
		LENOVO("I5-7200U","Window 10","8G"),
		MACBOOKPRO("Inter i5","Mac Os","8G");
	private final String cpu;
	private final String system;
	private final String mainMemoryCapacity;
	Computer(String cpu,String sytem,String mainMemoryCapacity){
		this.cpu=cpu;
		this.system=sytem;
		this.mainMemoryCapacity=mainMemoryCapacity;
	}
	public String get(){
		return cpu+system+mainMemoryCapacity;
	}
	public String toString(){
		return cpu + " " + system + " " + mainMemoryCapacity;
	}
	public static void main(String[] args){
		for (Computer c :Computer.values()) {
			System.out.print(c + "\n");
			}
			for (Computer c :Computer.values())
			if (c.get().contains("8G"))
				System.out.print("\n"+c);
		}

}
