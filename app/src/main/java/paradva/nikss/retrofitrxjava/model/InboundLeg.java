package paradva.nikss.retrofitrxjava.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;


public class InboundLeg{

	@SerializedName("CarrierIds")
	private List<Integer> carrierIds;

	@SerializedName("DepartureDate")
	private String departureDate;

	@SerializedName("OriginId")
	private int originId;

	@SerializedName("DestinationId")
	private int destinationId;

	public void setCarrierIds(List<Integer> carrierIds){
		this.carrierIds = carrierIds;
	}

	public List<Integer> getCarrierIds(){
		return carrierIds;
	}

	public void setDepartureDate(String departureDate){
		this.departureDate = departureDate;
	}

	public String getDepartureDate(){
		return departureDate;
	}

	public void setOriginId(int originId){
		this.originId = originId;
	}

	public int getOriginId(){
		return originId;
	}

	public void setDestinationId(int destinationId){
		this.destinationId = destinationId;
	}

	public int getDestinationId(){
		return destinationId;
	}

	@Override
 	public String toString(){
		return 
			"InboundLeg{" + 
			"carrierIds = '" + carrierIds + '\'' + 
			",departureDate = '" + departureDate + '\'' + 
			",originId = '" + originId + '\'' + 
			",destinationId = '" + destinationId + '\'' + 
			"}";
		}
}