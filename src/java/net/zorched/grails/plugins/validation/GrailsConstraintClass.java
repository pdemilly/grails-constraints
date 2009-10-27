/* Copyright 2009 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.zorched.grails.plugins.validation;

import groovy.lang.Closure;
import org.codehaus.groovy.grails.commons.InjectableGrailsClass;

import java.util.Map;

/**
 * Represents a validation class in Grails. 
 * 
 * @author Geoff Lane
 * 
 * @since 0.1
 */
public interface GrailsConstraintClass extends InjectableGrailsClass {
	
	/**
	 * Get the method which is executed by the validator.
	 */
	Closure getValidationMethod();

    /**
     * Get the method which is executed to determine if the constrained property
     * is supported by this Constraint.
     */
    Closure getSupportsMethod();

	public String getName();

    public String getDefaultMessage();

    public String getDefaultMessageCode();

    public String getFailureCode();
}
