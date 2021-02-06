package strategy;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) throws Exception {
		Context context = new Context();
		boolean fin = false;
		Scanner scanner = new Scanner(System.in);
		while (!fin) {
			System.out.println("Donner la strategy : ");

			String strategyClassName = "strategy." + scanner.nextLine();
			IStrategy strategy = (IStrategy) Class.forName(strategyClassName).newInstance();
			System.out.println("---------------------");
			context.setStrategy(strategy);
			context.process();
		}

		/*
		 * System.out.println("---------------------"); context.process();
		 * context.setStrategy(new StrategyImpl1());
		 * System.out.println("---------------------"); context.process();
		 * context.setStrategy(new StrategyImpl2());
		 * System.out.println("---------------------"); context.process();
		 * context.setStrategy(new StrategyImpl3());
		 * System.out.println("---------------------"); context.process();
		 */
	}
}
