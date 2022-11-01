package day30;

	public class CabInvoiceGenerator {

		public double calculateFare(double distance, double timeInMin) {

			double totalFare = distance * Constant.RATE_PER_KM
					+ timeInMin * Constant.TIME_CHARGE_PER_MIN;

			if (totalFare < Constant.MIN_FARE_AMT) {
				totalFare = Constant.MIN_FARE_AMT;
			}
			return totalFare;
		}

	}

