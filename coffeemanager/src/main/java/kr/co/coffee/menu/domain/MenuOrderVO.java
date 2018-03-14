package kr.co.coffee.menu.domain;

import kr.co.coffee.common.domain.Search;

public class MenuOrderVO extends Search {
	private String SortValue;

	public String getSortValue() {
		return SortValue;
	}

	public void setSortValue(String sortValue) {
		SortValue = sortValue;
	}
}
