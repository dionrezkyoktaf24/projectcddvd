public class cd extends product{
    //CD
    private String artist ;
    private int nomorlagu ;
    private String label ;

    public cd(){ //Mengakses Constructor SuperClass
        super();
        artist = "";
        nomorlagu = 0;
        label = "";
    }
    public cd (int number, String nama, int quantify, double price, String artist, int nomorlagu, String label) {
        super(number, nama, quantify, price);
        this.artist = artist;
        this.nomorlagu = nomorlagu;
        this.label = label;
    }


	public String getArtist() { 
		return this.artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getNomorlagu() {
		return this.nomorlagu;
	}

	public void setNomorlagu(int nomorlagu) {
		this.nomorlagu = nomorlagu;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}



    
}
