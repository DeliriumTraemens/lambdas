package main;

import java.util.concurrent.ConcurrentSkipListMap;
/**
 * Динамически изменяемый реестр способностей.
 *
 * @param <T>
 *            Любой функциональный интерфейс: Runnable, Callable<V>, Supplier<T>, BooleanSupplier,
 *            Consumer<T>, BiConsumer<T,U>, Predicate<T>, BiPredicate<T,U>, Function<T,R>,
 *            BiFunction<T,U,R>, UnaryOperator<T>, BinaryOperator<T>, другой из пакета
 *            {@link java.util.function} или свой собственный или любой другой функциональный.
 */
public class BehaviorRegistry <T>{
	
	public ConcurrentSkipListMap<String, T> map = new ConcurrentSkipListMap<>();
	
	//Main optrating methods
//	в скобки метода и передаем экземпляр биконсьюмера
	public void add(final String behaveName, final T behaveFunc ){
		this.assertContainsNameNot(behaveName);
		BehaviorRegistry.assertArgNotNull(behaveFunc);
		this.map.put(behaveName, behaveFunc);
	}
	
	public T get(final String behaveName){
		this.assertContainsName(behaveName);
		return this.map.get(behaveName);
	}
	
	public void replace(final String behaveName, final T behaveFunc){
		this.assertContainsName(behaveName);
		BehaviorRegistry.assertArgNotNull(behaveFunc);
		this.map.put(behaveName, behaveFunc);
	}
	
	public void remove(final String behaveName){
		this.assertContainsName(behaveName);
		this.map.remove(behaveName);
	}
	
	//Checks
	protected static void assertArgNotNull(final Object arg){
		if( (arg instanceof String) && !"".equals(arg) ) {
			return;
		}
		if( arg != null) {
			return;
		}
		throw new RuntimeException("Пустой аргумент");
	}
	
	protected void assertMapNotNull(){
		if( this.map == null) throw new RuntimeException("Отсутствует Map");
	}
	
	public boolean contains (final String behaveName){
		BehaviorRegistry.assertArgNotNull(behaveName);
		this.assertMapNotNull();
		return this.map.containsKey(behaveName) && (this.map.get(behaveName) != null);
	}
	
	protected void assertContainsName(final String behaveName){
		BehaviorRegistry.assertArgNotNull(behaveName);
		this.assertMapNotNull();
		if ( !this.contains(behaveName)){
			throw new RuntimeException("Способность \"" +behaveName+ "\" не зарегистрирована");
		}
	}
	
	protected void assertContainsNameNot(final String behaveName){
		BehaviorRegistry.assertArgNotNull(behaveName);
		this.assertMapNotNull();
		if(this.contains(behaveName)){
			throw new RuntimeException("Способность \"" +behaveName+ "\" уже зарегистрирована");
		}
	}

	
	
	
	
	
	
	
}//EoC
