/*  Copyright 2014 Ícaro Clever da Fonseca Braga

	Licensed to the Apache Software Foundation (ASF) under one
	or more contributor license agreements.  See the NOTICE file
	distributed with this work for additional information
	regarding copyright ownership.  The ASF licenses this file
	to you under the Apache License, Version 2.0 (the
	"License"); you may not use this file except in compliance
	with the License.  You may obtain a copy of the License at
	
	  http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing,
	software distributed under the License is distributed on an
	"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
	KIND, either express or implied.  See the License for the
	specific language governing permissions and limitations
	under the License.
 */
package br.ufmg.dcc.saotome.beholder.validators;

import br.ufmg.dcc.saotome.beholder.ui.Component;

/** Validate the HTML component values state in the interface.
 * @author icaroclever
 */
public interface ComponentValidator {

	/**
	 * Verify if the component attribute has the same values of the attribute expected.
	 * @param component HTML Component object
	 * @param attribute HTML attribute
	 * @param value attribute value
	 * @return Returns <i>true</i> if the component attribute value is equal to expected attribute value. 
	 */
    boolean isEqual(Component component, String attribute, String value);
    
    /**
	 * Verify if the component attribute contains the value of the expected attribute informed.
	 * informed.
	 * @param component HTML Component object
	 * @param attribute HTML attribute
	 * @param value attribute value
	 * @return Returns <i>true</i> if the component attribute value contains the expected attribute value.  
	 */
    boolean contains(Component component, String attribute, String value);
    
    /**
	 * Verify if the component informed exist in the interface.
	 * @param component HTML Component object
	 */
    boolean exist(Component component);
    
    /**
	 * Verify if the component informed is enabled in the interface.
	 * @param component HTML Component object
	 */
    boolean isEnabled(Component component);
}
