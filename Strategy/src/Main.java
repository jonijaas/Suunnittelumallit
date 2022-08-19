/*
 * @author Joni Jääskeläinen
 */
public class Main {
	public static void main(String[] args) {
		ListConverter strategyA = new StrategyA();
		ListConverter strategyB = new StrategyB();
		ListConverter strategyC = new StrategyC();
		
		ListContext list = new ListContext(strategyA);
		list.addList("Aaa");
		list.addList("Bbb");
		list.addList("Ccc");
		list.addList("Ddd");
		list.addList("Eee");
		list.addList("Fff");
		
		System.out.println("StrategyA: Rivinvaihto jokaisen alkion jälkeen");
		System.out.println(list.convertList());
		
		System.out.println("\nStrategyB: Rivinvaihto joka toisen alkion jälkeen");
		list.setStrategy(strategyB);
		System.out.println(list.convertList());
		
		System.out.println("\nStrategyC: Rivinvaihto joka kolmannen alkion jälkeen");
		list.setStrategy(strategyC);
		System.out.println(list.convertList());
		
	}
}
