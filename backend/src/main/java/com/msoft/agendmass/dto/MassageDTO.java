package com.msoft.agendmass.dto;

import java.io.Serializable;

import com.msoft.agendmass.entities.Massage;

public class MassageDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String title;
	private String description;
	private Double price;
	private String imgUrl;
	
	public MassageDTO() {
	}

	public MassageDTO(Long id, String title, String description, Double price, String imgUrl) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.price = price;
		this.imgUrl = imgUrl;
	}
	
	public MassageDTO(Massage entity) {
		id = entity.getId();
		title = entity.getTitle();
		description = entity.getDescription();
		price = entity.getPrice();
		imgUrl = entity.getImgUrl();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

}
