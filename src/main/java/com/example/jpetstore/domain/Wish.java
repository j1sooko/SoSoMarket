package com.example.jpetstore.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.support.PagedListHolder;

@SuppressWarnings("serial")
public class Wish implements Serializable {

  /* Private Fields */
	private int wishId;
	private int buyerId;
	private List<Product> wishList = new ArrayList<Product>();
	

	public int getWishId() {
		return wishId;
	}

	public void setWishId(int wishId) {
		this.wishId = wishId;
	}

	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

	public void setWishList(List<Product> wishList) {
		this.wishList = wishList;
	}

	public List<Product> getWishList() {
		return wishList;
	}
}
