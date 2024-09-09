
//Super Class
public class product {
    private int number ;
    private String nama ;
    private int quantify ;
    private double price ;

    public product () {
        number = 0;
        nama = "";
        quantify = 0;
        price = 0;
    }

    //Constructor Parameter
    public product (int number, String nama, int  quantify, double price) {
        this.number = number;
        this.nama = nama;
        this.quantify = quantify;
        this.price = price;
    }

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getNama() {
		return this.nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getQuintify() {
		return this.quantify;
	}

	public void setQuintify(int quantify) {
		this.quantify = quantify;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


   
}
