package com.example.jpetstore.service;

import java.util.List;

import com.example.jpetstore.domain.Account;
import com.example.jpetstore.domain.Auction;
import com.example.jpetstore.domain.Bidding;
import com.example.jpetstore.domain.Category;
import com.example.jpetstore.domain.Order;
import com.example.jpetstore.domain.Product;
import com.example.jpetstore.domain.Wish;

/**
 * JPetStore's central business interface.
 *
 * @author Juergen Hoeller
 * @since 30.11.2003
 */
public interface SosoMarketFacade {

	/* Account */
	Account getAccount(String accountId);

	Account getAccount(String accountId, String password);

	void insertAccount(Account account);

	void updateAccount(Account account);

	void deleteAccount(String accountId);

	/* Category */
	List<Category> getCategoryList();

	Category getCategory(int categoryId);

	/* Product */
	List<Product> getProductListByUser(String accountId);

	List<Product> getProductListByCategory(int categoryId);

	List<Product> searchProductList(String keyword);

	Product getProduct(int productId);

	List<Product> getAllProduct();

	void updateProduct(int productId);

	void insertProduct(Product product);

	void deleteProduct(int productId);

	void updateProductStatus(Product product);

	/* auction */
	List<Auction> getAuctionListByUser(String accountId);

	List<Auction> getAuctionListByCategory(int categoryId);

	List<Auction> searchAuctionList(String keyword);

	Auction getAuction(int auctionId);

	List<Auction> getAllAuction();

	void updateAuction(int auctionId);

	void insertAuction(Auction auction);

	void deleteAuction(int auctionId);

	void updateAuctionStatus(Auction auction);

  void updateWithdraw(Account accountId);

	/* Bidding */

	void insertBidding(Bidding bidding);

	Bidding getBidding(int biddingId);

	List<Bidding> getBiddingsByUser(String accountId);

	List<Bidding> getBiddingsByProduct(int auctionId);

	/* order */
	void insertOrder(Order order);

	Order getOrder(int orderId);

	List<Order> getOrderListByBuyer(String accountId);

	List<Order> getOrderListBySeller(String accountId);

	void updateOrderStatus(Order order);

	/* wish */
	void insertWish(Wish wish);

	void deleteWish(int wishId);

	List<Wish> getWishListByUser(String accountId);

}