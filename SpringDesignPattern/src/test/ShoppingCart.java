package test;

public class ShoppingCart {
		private PaymentStrategy PaymentStrategy=null;
		
		public void setPaymentStrategy(PaymentStrategy PaymentStrategy)
		{
			this.PaymentStrategy=PaymentStrategy;
			
		}
		
		public ShoppingCart(PaymentStrategy PaymentStrategy) {
			this.PaymentStrategy=PaymentStrategy;
		}
		
		public void checkout(int amount)
		{
           PaymentStrategy.pay(amount);
	    }

}
