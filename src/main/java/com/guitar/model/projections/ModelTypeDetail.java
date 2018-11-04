package com.guitar.model.projections;

import java.util.List;

import org.springframework.data.rest.core.config.Projection;

import com.guitar.model.Model;
import com.guitar.model.ModelType;

@Projection(name="modelType",types = { ModelType.class })
public interface ModelTypeDetail {
	public String getName();
	public List<Model> getModels();
}
