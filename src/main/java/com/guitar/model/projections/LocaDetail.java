package com.guitar.model.projections;

import org.springframework.data.rest.core.config.Projection;

import com.guitar.model.Manufacturer;

@Projection(name="locaDetail",types = { Manufacturer.class })
public interface LocaDetail {

}
