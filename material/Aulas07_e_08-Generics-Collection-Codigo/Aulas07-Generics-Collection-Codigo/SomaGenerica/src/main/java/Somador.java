
/**
 *
 * @author Jose F Rodrigues-Jr
 */
public class Somador<T extends Number> {

    private T valor1;
    private T valor2;

    public Somador(T valor1, T valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public int somaTipadaInt() throws TipoNaoSuportadoException{
        if(! (valor1 instanceof Integer))
            throw new TipoNaoSuportadoException();
        else
            return valor1.intValue() + valor2.intValue();
    }        
    
    public double somaTipadaDouble() throws TipoNaoSuportadoException{
        if(! (valor1 instanceof Double))
            throw new TipoNaoSuportadoException();
        else        
            return valor1.doubleValue() + valor2.doubleValue();
    }
    
    public T somaGenerica() throws TipoNaoSuportadoException {
        /*Para retornar um objeto com o resultado da soma*/
        /*é preciso usar o método valueOf, o qual cria um novo objeto*/
        if (valor1 instanceof Integer) {
            return (T) Integer.valueOf(valor1.intValue() + valor2.intValue());
        } else if (valor1 instanceof Double) {
            return (T) Double.valueOf(valor1.doubleValue() + valor2.doubleValue());
        } else if (valor1 instanceof Float) {
            return (T) Float.valueOf(valor1.floatValue() + valor2.floatValue());
        } else if (valor1 instanceof Long) {
            return (T) Long.valueOf(valor1.longValue() + valor2.longValue());
        } else if (valor1 instanceof Short) {
            return (T) Short.valueOf((short) (valor1.shortValue() + valor2.shortValue()));
        } else if (valor1 instanceof Byte) {
            return (T) Byte.valueOf((byte) (valor1.byteValue() + valor2.byteValue()));
        } else {
            throw new TipoNaoSuportadoException();
        }
    }
}


/*The casting to the appropriate return type is necessary because Java doesn't 
have built-in support for arithmetic operations on generic numeric types. 
When you perform arithmetic operations on Number objects, the result is always 
a double or a long if needed, and you need to explicitly cast it to the desired 
numeric type.
Here's why casting is necessary:
    Arithmetic Operations Result in double or long: In Java, arithmetic 
operations on Number objects result in double if the operands involve 
floating-point numbers (e.g., float or double) or long if the operands 
are integral numbers (e.g., int, long, short). Since you want to return 
a value of type T, which could be any numeric type, you need to cast the
result back to T to match the expected return type.

    Type Safety: Generics in Java are compile-time constructs. The type 
parameter T is erased at compile time, so the compiler doesn't know the 
exact runtime type of T. Casting to T helps maintain type safety by 
ensuring that the returned value matches the expected type, as defined
by the type parameter when you instantiate the Adder class.

Casting to the appropriate return type allows you to use the Adder class 
in a type-safe manner and ensures that the result of the addition operation
is of the same type as the input values, preserving the intended semantics 
of your generic class.*/