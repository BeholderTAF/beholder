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
package br.ufmg.dcc.saotome.beholder.ui.form;

import br.ufmg.dcc.saotome.beholder.ui.Component;
import br.ufmg.dcc.saotome.beholder.ui.event.Clickable;

/** The interface represents a HTML Components <b>Text Field</b>.
 * @author Ícaro Clever F. Braga (icaroclever@gmail.com)
 */
public interface TextField extends Component, Clickable {

    /** Get the actual value present in the text field.
     * @return value of the text field
     */
    String getValue();

    /** Fill the text field with a value. If there was a previous value
     * in the text field, it'll be lost and ovewrited by the value informed.
     * @param value to be filled
     */
    void fill(String value);
}
