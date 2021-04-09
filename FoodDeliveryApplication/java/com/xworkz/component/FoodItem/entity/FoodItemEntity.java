package com.xworkz.component.FoodItem.entity;

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
@Table (name = "food_entity")
public class FoodItemEntity {
@Id
@Column (name = "ID")
@NonNull
private int id;
@Column (name = "NAME")
@NonNull
private String name;
@Column (name = "PRICE")
@NonNull
private double price;
@Column (name = "DISCOUNT")
@NonNull
private int discount;
@Column (name = "TYPE")
@NonNull
private FoodType type;

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	FoodItemEntity other = (FoodItemEntity) obj;
	if (discount != other.discount)
		return false;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
		return false;
	if (type != other.type)
		return false;
	return true;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + discount;
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	long temp;
	temp = Double.doubleToLongBits(price);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((type == null) ? 0 : type.hashCode());
	return result;
}




}
