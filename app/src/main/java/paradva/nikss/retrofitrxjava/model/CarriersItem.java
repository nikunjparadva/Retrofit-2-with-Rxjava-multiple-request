package paradva.nikss.retrofitrxjava.model;


import com.google.gson.annotations.SerializedName;


public class CarriersItem{

	@SerializedName("CarrierId")
	private int carrierId;

	@SerializedName("Name")
	private String name;

	public void setCarrierId(int carrierId){
		this.carrierId = carrierId;
	}

	public int getCarrierId(){
		return carrierId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"CarriersItem{" + 
			"carrierId = '" + carrierId + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}