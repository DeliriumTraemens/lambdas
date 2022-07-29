//package main;
//
//import java.util.stream.Stream;
//
//public class Test {
//	public static void main(String[] args) {
//		Runnable behaviorFunc = null;
//
////		final Duck mallardDuck = new Duck();
////		behaviorFunc = () -> System.out.println("Я кряква");
////		EBehaviors.Display.sendTo(mallardDuck.behaviors::add, behaviorFunc);
////		EBehaviors.Fly.sendTo(mallardDuck.behaviors::add);
////		EBehaviors.Quack.sendTo(mallardDuck.behaviors::add);
////
//		final Duck redheadDuck = new Duck();
//		behaviorFunc = () -> System.out.println("Я красноголовая утка");
//		EBehaviors.Display.sendTo(redheadDuck.behaviors::add, behaviorFunc);
//		EBehaviors.Fly.sendTo(redheadDuck.behaviors::add);
//		EBehaviors.Quack.sendTo(redheadDuck.behaviors::add);
////
//		final Duck rubberDuck = new Duck();
//		behaviorFunc = () -> System.out.println("Я резиновая утка");
//		EBehaviors.Display.sendTo(rubberDuck.behaviors::add, behaviorFunc);
////		послать в аррай имя и переопределенный раннабл
//		behaviorFunc = ()-> System.out.println("Я шплю, нимефай");
//		rubberDuck.behaviors.add(EBehaviors.Sleep.name(),behaviorFunc);
//		EBehaviors.Quack.sendTo(rubberDuck.behaviors::add);
//
//		final Duck decoyDuck = new Duck();
//		behaviorFunc = () -> System.out.println("Я деревянная утка");
//		EBehaviors.Display.sendTo(decoyDuck.behaviors::add, behaviorFunc);
//		EBehaviors.Print.sendTo(decoyDuck.behaviors::add);
//
////		final Duck exclusiveDuck = new Duck();
////		behaviorFunc = () -> System.out.println("Я эксклюзивная утка");
////		EBehaviors.Display.sendTo(exclusiveDuck.behaviors::add, behaviorFunc);
////		behaviorFunc = () -> System.out.println("Я изрыгаю пламя    <== эксклюзивное поведение");
////		exclusiveDuck.behaviors.add("палить огнем", behaviorFunc);
//
//
////		final Duck[] ducks = { mallardDuck, redheadDuck, rubberDuck, decoyDuck, exclusiveDuck };
//
//		// Простой тест всех уток.
//		System.out.println("############################################## 1");
//		decoyDuck.perform("Представиться");
//
////		for (EBehaviors value : EBehaviors.values()) {
////			rubberDuck.behaviors.add(value.name,value.func);
////		}
//
////		Runnable finde=decoyDuck.beh.Find.func;
////		finde.run();
////		rubberDuck.perform("Представиться");
////		rubberDuck.perform("Find");
//		System.out.println("****************");
//		rubberDuck.performAll();
//
////		Stream.of(ducks).forEachOrdered(Duck::performAll);
//	}
//}
