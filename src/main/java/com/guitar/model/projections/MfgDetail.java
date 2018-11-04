package com.guitar.model.projections;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

import com.guitar.model.Location;
import com.guitar.model.Manufacturer;

@Projection(name="mfgDetail",types = { Manufacturer.class })
public interface MfgDetail {
	public Location getHeadquarters();
	public String getName() ;
	public Date getFoundedDate();
	public BigDecimal getAverageYearlySales();
	public Boolean getActive();
}
