package paradva.nikss.retrofitrxjava.model;

import com.google.gson.annotations.SerializedName;

public class GenderResponce{

	@SerializedName("gender")
	private String gender;

	@SerializedName("probability")
	private float probability;

	@SerializedName("name")
	private String name;

	@SerializedName("count")
	private int count;

	public String getGender(){
		return gender;
	}

	public float getProbability(){
		return probability;
	}

	public String getName(){
		return name;
	}

	public int getCount(){
		return count;
	}

	@Override
	public String toString() {
		return "GenderResponce{" +
				"gender='" + gender + '\'' +
				", probability=" + probability +
				", name='" + name + '\'' +
				", count=" + count +
				'}';
	}
}