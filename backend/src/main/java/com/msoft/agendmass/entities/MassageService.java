package com.msoft.agendmass.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;

@Entity
public class MassageService implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String title;
	private String description;
	private Double price;
	private String imgUrl;
	
	public MassageService() {
	}

	public MassageService(Long id, String title, String description, Double price, String imgUrl) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.price = price;
		this.imgUrl = imgUrl;
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MassageService other = (MassageService) obj;
		return Objects.equals(id, other.id);
	}

}
