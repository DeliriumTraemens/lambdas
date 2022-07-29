package main.interfaces;
/**
 * BiConsumer<T, U> imitation
 * */
@FunctionalInterface
public interface BiFake<T, U> {
    void foo(T t, U u);
}
