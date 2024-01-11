package de.telran.hw_8Jan;
/*
Написать Generic класс для арифметических операций над числами UtilsOperation в котором будут представлены методы:
T add(T arg1, T arg2) //добавление
T sub(T arg1, T arg2) //вычитание
T mult(T arg1, T arg2) //умножение
U div(T arg1, T arg2) //деление
T sqr(T arg1) //получение квадрата
Показать примеры их использования.
 */
public class UtilsOperationDemo {
    public static void main(String[] args) {
        System.out.println(UtilsOperation.<Integer>add(12, 48));
        System.out.println(UtilsOperation.<Double>sub(12.0, 48.35));
        System.out.println(UtilsOperation.<Long>mult(678989898L, 82828L));
        System.out.println(UtilsOperation.<Float>div(12909.8383883F, 48.828288384848F));
        System.out.println(UtilsOperation.<Integer>sqr(67));
    }
}
class UtilsOperation {
    protected static <T extends Number> T add (T arg1, T arg2) {
        if (arg1 instanceof Integer)
            return (T) Integer.valueOf(arg1.intValue() + arg2.intValue());
        else if (arg1 instanceof Double)
            return (T) Double.valueOf(arg1.doubleValue() + arg2.doubleValue());
        else if (arg1 instanceof Long)
            return (T) Long.valueOf(arg1.longValue() + arg2.longValue());
        else if (arg1 instanceof Float)
            return (T) Float.valueOf(arg1.floatValue() + arg2.floatValue());
        else throw new Error("Unsupported type");
    }

    protected static <T extends Number> T sub (T arg1, T arg2) {
        if (arg1 instanceof Integer)
            return (T) Integer.valueOf(arg1.intValue() - arg2.intValue());
        else if (arg1 instanceof Double)
            return (T) Double.valueOf(arg1.doubleValue() - arg2.doubleValue());
        else if (arg1 instanceof Long)
            return (T) Long.valueOf(arg1.longValue() - arg2.longValue());
        else if (arg1 instanceof Float)
            return (T) Float.valueOf(arg1.floatValue() - arg2.floatValue());
        else throw new Error("Unsupported type");
    }

    protected static <T extends Number> T mult (T arg1, T arg2) {
        if (arg1 instanceof Integer)
            return (T) Integer.valueOf(arg1.intValue() * arg2.intValue());
        else if (arg1 instanceof Double)
            return (T) Double.valueOf(arg1.doubleValue() * arg2.doubleValue());
        else if (arg1 instanceof Long)
            return (T) Long.valueOf(arg1.longValue() * arg2.longValue());
        else if (arg1 instanceof Float)
            return (T) Float.valueOf(arg1.floatValue() * arg2.floatValue());
        else throw new Error("Unsupported type");
    }

    protected static <T extends Number> T div (T arg1, T arg2) {
        if (arg1 instanceof Integer)
            return arg2.intValue() != 0 ? (T) Integer.valueOf(arg1.intValue() / arg2.intValue()) : (T) Integer.valueOf(00000);
        else if (arg1 instanceof Double)
            return arg2.doubleValue() != 0 ? (T) Double.valueOf(arg1.doubleValue() / arg2.doubleValue()) : (T) Double.valueOf(00000);
        else if (arg1 instanceof Long)
            return arg2.longValue() != 0 ? (T) Long.valueOf(arg1.longValue() / arg2.longValue()) : (T) Long.valueOf(00000);
        else if (arg1 instanceof Float)
            return arg2.floatValue() != 0 ? (T) Float.valueOf(arg1.floatValue() / arg2.floatValue()) : (T) Float.valueOf(00000);
        else throw new Error("Unsupported type");
    }

    protected static <T extends Number> T sqr (T arg) {
        if (arg instanceof Integer)
            return (T) Integer.valueOf(arg.intValue() * arg.intValue());
        if (arg instanceof Double)
            return (T) Double.valueOf(arg.doubleValue() * arg.doubleValue());
        if (arg instanceof Long)
            return (T) Long.valueOf(arg.longValue() * arg.longValue());
        if (arg instanceof Float)
            return (T) Float.valueOf(arg.floatValue() * arg.floatValue());
        else throw new Error("Unsupported type");
    }
}

