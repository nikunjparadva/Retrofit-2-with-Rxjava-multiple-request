package paradva.nikss.retrofitrxjava.model;


import com.google.gson.annotations.SerializedName;


public class PlacesItem{

	@SerializedName("PlaceId")
	private int placeId;

	@SerializedName("Type")
	private String type;

	@SerializedName("CityId")
	private String cityId;

	@SerializedName("CountryName")
	private String countryName;

	@SerializedName("IataCode")
	private String iataCode;

	@SerializedName("SkyscannerCode")
	private String skyscannerCode;

	@SerializedName("CityName")
	private String cityName;

	@SerializedName("Name")
	private String name;

	public void setPlaceId(int placeId){
		this.placeId = placeId;
	}

	public int getPlaceId(){
		return placeId;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setCityId(String cityId){
		this.cityId = cityId;
	}

	public String getCityId(){
		return cityId;
	}

	public void setCountryName(String countryName){
		this.countryName = countryName;
	}

	public String getCountryName(){
		return countryName;
	}

	public void setIataCode(String iataCode){
		this.iataCode = iataCode;
	}

	public String getIataCode(){
		return iataCode;
	}

	public void setSkyscannerCode(String skyscannerCode){
		this.skyscannerCode = skyscannerCode;
	}

	public String getSkyscannerCode(){
		return skyscannerCode;
	}

	public void setCityName(String cityName){
		this.cityName = cityName;
	}

	public String getCityName(){
		return cityName;
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
			"PlacesItem{" + 
			"placeId = '" + placeId + '\'' + 
			",type = '" + type + '\'' + 
			",cityId = '" + cityId + '\'' + 
			",countryName = '" + countryName + '\'' + 
			",iataCode = '" + iataCode + '\'' + 
			",skyscannerCode = '" + skyscannerCode + '\'' + 
			",cityName = '" + cityName + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}