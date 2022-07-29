package main;

import main.interfaces.RunnableFake;

public class Duck {
	protected BehaviorRegistry<Runnable> behaviors = new BehaviorRegistry<>();
	protected EBehaviors beh;
	public void perform(final String behaveName){
		this.behaviors.get(behaveName).run();
	}

	/**
	*   Исполняет все зареганные поведения в порядке добавления в реестр
	**/
	public void performAll(){
		this.behaviors.map.descendingKeySet().forEach(this::perform);
		System.out.println("-------------------------------------");
	}
}
