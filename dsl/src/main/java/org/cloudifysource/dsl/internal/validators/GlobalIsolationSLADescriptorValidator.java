package org.cloudifysource.dsl.internal.validators;

import org.cloudifysource.dsl.DSLValidation;

import org.cloudifysource.dsl.GlobalIsolationSLADescriptor;
import org.cloudifysource.dsl.internal.DSLValidationContext;
import org.cloudifysource.dsl.internal.DSLValidationException;

public class GlobalIsolationSLADescriptorValidator implements DSLValidator<GlobalIsolationSLADescriptor> {

	private GlobalIsolationSLADescriptor entity;

	@Override
	public void setDSLEntity(GlobalIsolationSLADescriptor dslEntity) {
		this.entity = dslEntity;
	}

	@DSLValidation
	void validateDefaultValues(final DSLValidationContext validationContext)
			throws DSLValidationException {

		if (entity.getInstanceMemoryMB() < 0) {
			throw new DSLValidationException("instanceMemoryInMB cannot be negative");
		}
		if (entity.getInstanceCpuCores() < 0) {
			throw new DSLValidationException("instanceCpuCores cannot be negative");
		}
	}

}
