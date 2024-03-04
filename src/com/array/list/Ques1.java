package com.array.list;

class TransactionParty{
	String seller;
	String buyer;
	public TransactionParty(String seller, String buyer){
		this.seller=seller;
		this.buyer=buyer;
	}
}
class Receipt{
	TransactionParty transactionParty;
	String productsQr;
	public Receipt(TransactionParty transactionParty, String productsQr) {
		this.transactionParty=transactionParty;
		this.productsQr=productsQr;
	}
}
class GenerateReceipt{
	public int verifyParty(Receipt r) {
		
	}
}

public class Ques1 {
	public static void main(String[] args) {
		
	}

}
