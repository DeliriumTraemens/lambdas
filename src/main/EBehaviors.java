package main;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import main.interfaces.BiFake;
import main.interfaces.RunnableFake;

import java.util.function.BiConsumer;

public enum EBehaviors {
	Display("Представиться", ()-> System.out.println("Я утка")),
	Fly("Летать", ()-> System.out.println("Я летаю")),
	Sleep("Спать", ()-> System.out.println("Zzzzzzz")),
	Quack("Крякать", ()-> System.out.println("Кря-кря")),
	Propagate("Размножаться", ()-> System.out.println("O-o")),
	Print("Print", ()->{
		for(int i=0; i<=5; i++){
			System.out.println(i);
		}
	}),
	Find("Find", ()-> System.out.println("Find"));
	
	public String name;
	public Runnable func;
	
	private EBehaviors(final String m_name, final Runnable m_func) {
		this.name = m_name;
		this.func = m_func;
	}
	
	public void sendTo(final BiConsumer<String, Runnable> someApiFunction){
		someApiFunction.accept(this.name, this.func);
	}

	public void sendTo(final BiConsumer<String,Runnable> someApiFunction, final Runnable m_func){
		someApiFunction.accept(this.name, m_func);
	}


//	public void sendTo(final BiFake<String, Runnable> someApiFunction){
//		someApiFunction.foo(this.name, this.func);
//	}
//	public void sendTo(final BiFake<String, Runnable> someApiFunction, final RunnableFake m_func){
//		someApiFunction.foo(this.name, m_func);
//	}
//
	
}
