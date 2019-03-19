package com.develogical;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RecentlyUsedListTest {

	@Test 
	public void returnsEmptyListInitially() {
		assertThat(new RecentlyUsedList().isEmpty(), is(true));
	}

	@Test
	public void addIsPossible() {
		RecentlyUsedList recentList = new RecentlyUsedList();
		recentList.add("bob");
		assertThat(recentList.isEmpty(), is(false));
	}

	@Test
	public void getItemFromListOk() {
		RecentlyUsedList recentList = new RecentlyUsedList();
		recentList.add("bob");
		assertThat(recentList.get(1), is( "bob"));
	}

	@Test
	public void getItemFromListOk2() {
		RecentlyUsedList recentList = new RecentlyUsedList();
		recentList.add("alice");
		assertThat(recentList.get(1), is( "alice"));
	}

	@Test
	public void getNthMostRecent() {
		RecentlyUsedList recentList = new RecentlyUsedList();
		recentList.add("alice");
		recentList.add("bob");
		assertThat(recentList.get(2), is( "alice"));
		assertThat(recentList.get(1), is( "bob"));
	}

//	TODO - Steven to do next test...

}
