package genericType;

public class TypeLimitForMethod {
	/**
     * 限定类型使用extends关键字指定
     * 可以使类，接口，类放在前面接口放在后面用&符号分割
     * 例如：<T extends ArrayList & Comparable<T> & Serializable>
     */
	public static <T extends Comparable<T> > T getMin(T a, T b) {
		return a.compareTo(b) > 0 ? b : a;
	}
}
