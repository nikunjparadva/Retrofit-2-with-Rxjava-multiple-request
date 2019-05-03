package paradva.nikss.retrofitrxjava.model;


import com.google.gson.annotations.SerializedName;


public class QuotesItem{

	@SerializedName("QuoteId")
	private int quoteId;

	@SerializedName("InboundLeg")
	private InboundLeg inboundLeg;

	@SerializedName("QuoteDateTime")
	private String quoteDateTime;

	@SerializedName("MinPrice")
	private int minPrice;

	@SerializedName("OutboundLeg")
	private OutboundLeg outboundLeg;

	@SerializedName("Direct")
	private boolean direct;

	public void setQuoteId(int quoteId){
		this.quoteId = quoteId;
	}

	public int getQuoteId(){
		return quoteId;
	}

	public void setInboundLeg(InboundLeg inboundLeg){
		this.inboundLeg = inboundLeg;
	}

	public InboundLeg getInboundLeg(){
		return inboundLeg;
	}

	public void setQuoteDateTime(String quoteDateTime){
		this.quoteDateTime = quoteDateTime;
	}

	public String getQuoteDateTime(){
		return quoteDateTime;
	}

	public void setMinPrice(int minPrice){
		this.minPrice = minPrice;
	}

	public int getMinPrice(){
		return minPrice;
	}

	public void setOutboundLeg(OutboundLeg outboundLeg){
		this.outboundLeg = outboundLeg;
	}

	public OutboundLeg getOutboundLeg(){
		return outboundLeg;
	}

	public void setDirect(boolean direct){
		this.direct = direct;
	}

	public boolean isDirect(){
		return direct;
	}

	@Override
 	public String toString(){
		return 
			"QuotesItem{" + 
			"quoteId = '" + quoteId + '\'' + 
			",inboundLeg = '" + inboundLeg + '\'' + 
			",quoteDateTime = '" + quoteDateTime + '\'' + 
			",minPrice = '" + minPrice + '\'' + 
			",outboundLeg = '" + outboundLeg + '\'' + 
			",direct = '" + direct + '\'' + 
			"}";
		}
}