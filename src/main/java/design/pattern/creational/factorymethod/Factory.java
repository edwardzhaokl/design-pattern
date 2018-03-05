package design.pattern.creational.factorymethodpattern;

/**
 * author: zhaokl
 * <p>
 * created at: 08/12/2017 14:29
 * <p>
 * desc:
 */
public abstract class Factory {

    static Product factoryMethod() {
		System.out.println("interface factory");

        return null;
    }
}
