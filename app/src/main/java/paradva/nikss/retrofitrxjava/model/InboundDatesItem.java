package paradva.nikss.retrofitrxjava.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;


public class InboundDatesItem{

	@SerializedName("Price")
	private int price;

	@SerializedName("PartialDate")
	private String partialDate;

	@SerializedName("QuoteDateTime")
	private String quoteDateTime;

	@SerializedName("QuoteIds")
	private List<Integer> quoteIds;

	public void setPrice(int price){
		this.price = price;
	}

	public int getPrice(){
		return price;
	}

	public void setPartialDate(String partialDate){
		this.partialDate = partialDate;
	}

	public String getPartialDate(){
		return partialDate;
	}

	public void setQuoteDateTime(String quoteDateTime){
		this.quoteDateTime = quoteDateTime;
	}

	public String getQuoteDateTime(){
		return quoteDateTime;
	}

	public void setQuoteIds(List<Integer> quoteIds){
		this.quoteIds = quoteIds;
	}

	public List<Integer> getQuoteIds(){
		return quoteIds;
	}

	@Override
 	public String toString(){
		return 
			"InboundDatesItem{" + 
			"price = '" + price + '\'' + 
			",partialDate = '" + partialDate + '\'' + 
			",quoteDateTime = '" + quoteDateTime + '\'' + 
			",quoteIds = '" + quoteIds + '\'' + 
			"}";
		}
}