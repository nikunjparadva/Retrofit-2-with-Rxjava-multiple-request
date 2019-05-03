package paradva.nikss.retrofitrxjava.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;


public class Dates{

	@SerializedName("InboundDates")
	private List<InboundDatesItem> inboundDates;

	@SerializedName("OutboundDates")
	private List<OutboundDatesItem> outboundDates;

	public void setInboundDates(List<InboundDatesItem> inboundDates){
		this.inboundDates = inboundDates;
	}

	public List<InboundDatesItem> getInboundDates(){
		return inboundDates;
	}

	public void setOutboundDates(List<OutboundDatesItem> outboundDates){
		this.outboundDates = outboundDates;
	}

	public List<OutboundDatesItem> getOutboundDates(){
		return outboundDates;
	}

	@Override
 	public String toString(){
		return 
			"Dates{" + 
			"inboundDates = '" + inboundDates + '\'' + 
			",outboundDates = '" + outboundDates + '\'' + 
			"}";
		}
}