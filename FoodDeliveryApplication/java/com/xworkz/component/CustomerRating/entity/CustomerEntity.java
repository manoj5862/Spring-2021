package com.xworkz.component.CustomerRating.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.component.constant.FoodType;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
@Data
@RequiredArgsConstructor
@ToString
@Entity
@Table (name = "customer_entity")
public class CustomerEntity {
@Id
@Column (name = "CID")
@NonNull
private int cid;
@Column (name = "NAME")
@NonNull
private String name;
@Column (name = "RATING")
@NonNull
private double rating;
@Column (name = "LOCATION")
@NonNull
private String location;
@Column (name = "ORDEREDFOOD")
@NonNull
private FoodType orderedFood;
@Column (name = "PRICE")
@NonNull
private double price;



@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((location == null) ? 0 : location.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((orderedFood == null) ? 0 : orderedFood.hashCode());
	long temp;
	temp = Double.doubleToLongBits(price);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	temp = Double.doubleToLongBits(rating);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	CustomerEntity other = (CustomerEntity) obj;
	if (location == null) {
		if (other.location != null)
			return false;
	} else if (!location.equals(other.location))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (orderedFood != other.orderedFood)
		return false;
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
		return false;
	if (Double.doubleToLongBits(rating) != Double.doubleToLongBits(other.rating))
		return false;
	return true;
}

}
