public class dvd extends product{
    //DvD

    private int light ;
    private String rating ;
    private String studio ;

    public dvd() {
        super();
        light = 0;
        rating = "";
        studio = "";   
    }

    //Constructor Parameter
    public dvd (int number, String nama, int quantify, double price, String artist, int nomorlagu, String label) {
        super(number, nama, quantify, price);
        this.light = light;
        this.rating = rating;
        this.studio = studio;
    }

	public int getLight() {
		return this.light;
	}

	public void setLight(int light) {
		this.light = light;
	}

	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getStudio() {
		return this.studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}


   
    
}
