package com.sp.lang.symbol;

public class GlobalScope  extends BaseScope{

	public GlobalScope() {
		super(null);
	}
	

	@Override
	public String getScopeName() {
		return "global";
	}
}
