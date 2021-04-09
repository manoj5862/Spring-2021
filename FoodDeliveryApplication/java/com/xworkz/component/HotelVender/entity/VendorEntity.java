package com.xworkz.component.HotelVender.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.component.constant.FoodType;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Data
@RequiredArgsConstructor
@Entity
@Table (name = "vendor_table")
public class VendorEntity {
@Id
@Column (name = "VID")
@NonNull
private int vid;
@Column (name = "NAME")
@NonNull
private String name;
@Column (name = "RESTNAME")
@NonNull
private  String RestName;
@Column (name = "FOODTYPE")
@NonNull
private FoodType foodType;
@Column (name = "DISCOUNT")
@NonNull
private double discount;

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((RestName == null) ? 0 : RestName.hashCode());
	long temp;
	temp = Double.doubleToLongBits(discount);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((foodType == null) ? 0 : foodType.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
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
	VendorEntity other = (VendorEntity) obj;
	if (RestName == null) {
		if (other.RestName != null)
			return false;
	} else if (!RestName.equals(other.RestName))
		return false;
	if (Double.doubleToLongBits(discount) != Double.doubleToLongBits(other.discount))
		return false;
	if (foodType != other.foodType)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}


}