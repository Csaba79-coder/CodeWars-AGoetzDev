package org.alexgdev.codewars.fivekyu;

import java.util.List;

/*
 * https://www.codewars.com/kata/paginationhelper/train/java
 */
public class PaginationHelper<I> {

  private int totalItems = 0;
  private int pageSize = 0;
  private int pages = 0;

  /**
   * The constructor takes in an array of items and a integer indicating how many
   * items fit within a single page
   */
  public PaginationHelper(List<I> collection, int itemsPerPage) {
     totalItems = collection.size();
     pageSize = itemsPerPage;
     pages = (int)Math.ceil((totalItems/(pageSize+0.0)));
  }
  
  /**
   * returns the number of items within the entire collection
   */
  public int itemCount() {
        return totalItems;
  }
  
  /**
   * returns the number of pages
   */
  public int pageCount() {
      return pages;
  }
  
  /**
   * returns the number of items on the current page. page_index is zero based.
   * this method should return -1 for pageIndex values that are out of range
   */
  public int pageItemCount(int pageIndex) {
	  if(pageIndex < 0 || pageIndex > pages-1){
		  return -1;
	  }
	  if(pageIndex != pages-1){
		  return pageSize;
	  }
	  return totalItems%pageSize;
	  
  }
  
  /**
   * determines what page an item is on. Zero based indexes
   * this method should return -1 for itemIndex values that are out of range
   */
  public int pageIndex(int itemIndex) {
	 if(itemIndex <0 || itemIndex >totalItems-1){
		 return -1;
	 }
	  return itemIndex / pageSize;
  }
}