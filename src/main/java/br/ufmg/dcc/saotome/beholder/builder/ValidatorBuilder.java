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
package br.ufmg.dcc.saotome.beholder.builder;

import br.ufmg.dcc.saotome.beholder.validators.ComponentValidator;

/**
 * The Interface Builder returns all Interface Asserts.
 * The test cases uses it to create new instances of builder classes,
 * separating the technology used to run the tests of the creation of
 * test cases.
 * @author Ícaro Clever F. Braga (icaroclever@gmail.com)
 */
public interface ValidatorBuilder {
    
    /** Return a object instance that implements a HtmlComponentAssert
     * interface.
     * @return WebPageAssert Interface object
     */
    ComponentValidator componentAssertInstance();

}
