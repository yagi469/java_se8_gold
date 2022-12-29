package q71;

// A. 
//public class Test<? extends Integer> {}

// B. 
//public class Test<T implements Comparator> {}

// C. 
public class Test<T, U extends T> {}

// D. 
//public class Test<T super String> {}