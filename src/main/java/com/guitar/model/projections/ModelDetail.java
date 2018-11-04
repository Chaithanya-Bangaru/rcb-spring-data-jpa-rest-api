package com.guitar.model.projections;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

import com.guitar.model.Manufacturer;
import com.guitar.model.Model;
import com.guitar.model.ModelType;

@Projection(name = "modelDetail", types = { Model.class })
public interface ModelDetail {
	
	public Manufacturer getManufacturer();
	public ModelType getModelType();
	public String getName();
	public BigDecimal getPrice();
	public int getFrets();
	public String getWoodType();
	public Date getYearFirstMade();

}
