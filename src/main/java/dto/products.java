package dto;

import java.io.Serializable;
import java.util.List;

public class products implements Serializable
{
	private int id;
	private String title;
	private String description;
	private int price;
	private float discountPercentage;	
	private float rating;	
	private int stock;
	private String brand;
	private String category;
	private String thumbnail;
	List<String> images;
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public int getPrice() {
		return price;
	}
	public float getDiscountPercentage() {
		return discountPercentage;
	}
	public float getRating() {
		return rating;
	}
	public int getStock() {
		return stock;
	}
	public String getBrand() {
		return brand;
	}
	public String getCategory() {
		return category;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public List<String> getImages() {
		return images;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDiscountPercentage(float discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public void setImages(List<String> images) {
		this.images = images;
	}
	@Override
	public String toString() {
		return "JsondumyData [id=" + id + ", title=" + title + ", description=" + description + ", price=" + price
				+ ", discountPercentage=" + discountPercentage + ", rating=" + rating + ", stock=" + stock + ", brand="
				+ brand + ", category=" + category + ", thumbnail=" + thumbnail + ", images=" + images + "]";
	}
}