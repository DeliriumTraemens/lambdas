package main;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import main.interfaces.RunnableFake;
import org.w3c.dom.ls.LSOutput;

/**
 * Do not forget main method)))))
 * */

public class Test2 {
    public static void main(String[] args) {

    Runnable func1;

//    For Lambda valid operation created objects must be Final
    final Duck mallardDuck = new Duck();

//    Create any operational action and assign it to FakedIF var
    func1 = () -> System.out.println("Я кряяяяква");
    EBehaviors.Display.sendTo(mallardDuck.behaviors::add, func1);

    mallardDuck.performAll();

    }
}
