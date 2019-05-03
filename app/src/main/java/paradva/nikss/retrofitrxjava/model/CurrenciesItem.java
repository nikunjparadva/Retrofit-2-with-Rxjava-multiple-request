package paradva.nikss.retrofitrxjava.model;


import com.google.gson.annotations.SerializedName;


public class CurrenciesItem{

	@SerializedName("DecimalSeparator")
	private String decimalSeparator;

	@SerializedName("ThousandsSeparator")
	private String thousandsSeparator;

	@SerializedName("SymbolOnLeft")
	private boolean symbolOnLeft;

	@SerializedName("SpaceBetweenAmountAndSymbol")
	private boolean spaceBetweenAmountAndSymbol;

	@SerializedName("Symbol")
	private String symbol;

	@SerializedName("DecimalDigits")
	private int decimalDigits;

	@SerializedName("Code")
	private String code;

	@SerializedName("RoundingCoefficient")
	private int roundingCoefficient;

	public void setDecimalSeparator(String decimalSeparator){
		this.decimalSeparator = decimalSeparator;
	}

	public String getDecimalSeparator(){
		return decimalSeparator;
	}

	public void setThousandsSeparator(String thousandsSeparator){
		this.thousandsSeparator = thousandsSeparator;
	}

	public String getThousandsSeparator(){
		return thousandsSeparator;
	}

	public void setSymbolOnLeft(boolean symbolOnLeft){
		this.symbolOnLeft = symbolOnLeft;
	}

	public boolean isSymbolOnLeft(){
		return symbolOnLeft;
	}

	public void setSpaceBetweenAmountAndSymbol(boolean spaceBetweenAmountAndSymbol){
		this.spaceBetweenAmountAndSymbol = spaceBetweenAmountAndSymbol;
	}

	public boolean isSpaceBetweenAmountAndSymbol(){
		return spaceBetweenAmountAndSymbol;
	}

	public void setSymbol(String symbol){
		this.symbol = symbol;
	}

	public String getSymbol(){
		return symbol;
	}

	public void setDecimalDigits(int decimalDigits){
		this.decimalDigits = decimalDigits;
	}

	public int getDecimalDigits(){
		return decimalDigits;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setRoundingCoefficient(int roundingCoefficient){
		this.roundingCoefficient = roundingCoefficient;
	}

	public int getRoundingCoefficient(){
		return roundingCoefficient;
	}

	@Override
 	public String toString(){
		return 
			"CurrenciesItem{" + 
			"decimalSeparator = '" + decimalSeparator + '\'' + 
			",thousandsSeparator = '" + thousandsSeparator + '\'' + 
			",symbolOnLeft = '" + symbolOnLeft + '\'' + 
			",spaceBetweenAmountAndSymbol = '" + spaceBetweenAmountAndSymbol + '\'' + 
			",symbol = '" + symbol + '\'' + 
			",decimalDigits = '" + decimalDigits + '\'' + 
			",code = '" + code + '\'' + 
			",roundingCoefficient = '" + roundingCoefficient + '\'' + 
			"}";
		}
}