package core.collections;

import java.util.ArrayList;

public class CustomList<T> extends ArrayList<T>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		CustomList<String> list=new CustomList<>();
		list.add("atom");
	}

}
